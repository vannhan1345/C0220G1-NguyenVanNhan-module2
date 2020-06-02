package com.codegym.controller;

import com.codegym.model.*;
import com.codegym.service.ContractService;
import com.codegym.service.CustomerService;
import com.codegym.service.EmployeeService;
import com.codegym.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
@Controller
public class ContractController {
    @Autowired
    ContractService contractService;
    @Autowired
    EmployeeService employeeService;
    @Autowired
    CustomerService customerService;
    @Autowired
    ServiceService serviceService;
    @ModelAttribute("employee")
    public List<Employee> showTypeEmployee() {
        return employeeService.findAll();
    }
    @ModelAttribute("customer")
    public List<Customer> showCustomer() {
        return customerService.findAll();
    }
    @ModelAttribute("service")
    public List<Service> showService() {
        return serviceService.findAll();
    }
    @GetMapping("/contract")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/contract/create");
        Contract contract = new Contract();
        modelAndView.addObject("contract", contract);
        return modelAndView;
    }

    @PostMapping("/create-contract")
    public ModelAndView saveContract(@ModelAttribute("contract") Contract contract) {
        contractService.save(contract);
        ModelAndView modelAndView = new ModelAndView("/contract/create");
        modelAndView.addObject("contract", new Contract());
        modelAndView.addObject("message", "Add new contract success!");
        return modelAndView;
    }

    @GetMapping("/list-contract")
    public ModelAndView showListContract(@RequestParam("keyword") Optional<String> keyword, Pageable pageable) {
        Pageable pageableSortById = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("id").ascending());
        String keywordLast = null;
        Page<Contract> contracts;
        if (keyword.isPresent()) {
            keywordLast = keyword.get();
            contracts = contractService.findAllByNumberContaining(keywordLast, pageableSortById);



        } else {
            contracts = contractService.findAll(pageableSortById);
        }
        ModelAndView modelAndView = new ModelAndView("/contract/list");
        modelAndView.addObject("listcontract", contracts);
        modelAndView.addObject("keyword", keywordLast);
        return modelAndView;
    }

    @GetMapping("/edit-contract/{id}")
    public ModelAndView showEditContract(@PathVariable Long id) {
        Contract contract = contractService.findById(id);
        if (contract != null) {
            ModelAndView modelAndView = new ModelAndView("/contract/edit");
            modelAndView.addObject("contract", contract);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/edit-contract")
    public ModelAndView updateContract(@ModelAttribute("contract") Contract contract) {
        contractService.save(contract);
        ModelAndView modelAndView = new ModelAndView("/contract/edit");
        modelAndView.addObject("contract", contract);
        modelAndView.addObject("message", "Update contract success!");
        return modelAndView;
    }

    @GetMapping("/delete-contract/{id}")
    public ModelAndView showDeleteContract(@PathVariable Long id) {
        Contract contract = contractService.findById(id);
        if (contract != null) {
            ModelAndView modelAndView = new ModelAndView("/contract/delete");
            modelAndView.addObject("contract", contract);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/delete-contract")
    public String RemoveContract(@ModelAttribute("contract") Contract contract) {
        contractService.remove(contract.getId());
        return "redirect:list-contract";

    }

}
