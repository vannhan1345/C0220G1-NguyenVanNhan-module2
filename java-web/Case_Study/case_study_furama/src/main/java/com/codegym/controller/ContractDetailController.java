package com.codegym.controller;

import com.codegym.model.*;
import com.codegym.service.AccompanyingServiceService;
import com.codegym.service.ContractDetailService;
import com.codegym.service.ContractService;
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
public class ContractDetailController {
    @Autowired
    ContractDetailService contractDetailService;
    @Autowired
    ContractService contractService;
    @Autowired
    AccompanyingServiceService accompanyingServiceService;

    @ModelAttribute("contracts")
    public List<Contract> showContract() {
        return contractService.findAll();
    }

    @ModelAttribute("accompanyingService")
    public List<AccompanyingService> showAccompanying() {
        return accompanyingServiceService.findAll();
    }

    @GetMapping("/contractDetail")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/contractDetail/create");
        ContractDetail contractDetail = new ContractDetail();
        modelAndView.addObject("contractDetail", contractDetail);
        return modelAndView;
    }

    @PostMapping("/create-contractDetail")
    public ModelAndView saveContractDetail(@ModelAttribute("contract") ContractDetail contractDetail) {
        contractDetailService.save(contractDetail);
        ModelAndView modelAndView = new ModelAndView("/contractDetail/create");
        modelAndView.addObject("contractDetail", new ContractDetail());
        modelAndView.addObject("message", "Add new contract detail success!");
        return modelAndView;
    }

    @GetMapping("/list-contractDetail")
    public ModelAndView showListContractDetail(@RequestParam("keyword") Optional<String> keyword, Pageable pageable) {
        Pageable pageableSortById = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("id").ascending());
        String keywordLast = null;
        Page<ContractDetail> contractDetails;
        if (keyword.isPresent()) {
            keywordLast = keyword.get();
            contractDetails = contractDetailService.findAllByNumberContaining(keywordLast, pageableSortById);



        } else {
            contractDetails = contractDetailService.findAll(pageableSortById);
        }
        ModelAndView modelAndView = new ModelAndView("/contractDetail/list");
        modelAndView.addObject("listcontractDetail", contractDetails);
        modelAndView.addObject("keyword", keywordLast);
        return modelAndView;
    }

    @GetMapping("/edit-contractDetail/{id}")
    public ModelAndView showEditContractDetail(@PathVariable Long id) {
        ContractDetail contractDetail = contractDetailService.findById(id);
        if (contractDetail != null) {
            ModelAndView modelAndView = new ModelAndView("/contractDetail/edit");
            modelAndView.addObject("contractDetail", contractDetail);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/edit-contractDetail")
    public ModelAndView updateContractDetail(@ModelAttribute("contractDetail") ContractDetail contractDetail) {
        contractDetailService.save(contractDetail);
        ModelAndView modelAndView = new ModelAndView("/contractDetail/edit");
        modelAndView.addObject("contractDetail", contractDetail);
        modelAndView.addObject("message", "Update contract detail success!");
        return modelAndView;
    }

    @GetMapping("/delete-contractDetail/{id}")
    public ModelAndView showDeleteContract(@PathVariable Long id) {
        ContractDetail contractDetail = contractDetailService.findById(id);
        if (contractDetail != null) {
            ModelAndView modelAndView = new ModelAndView("/contractDetail/delete");
            modelAndView.addObject("contractDetail", contractDetail);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/delete-contractDetail")
    public String RemoveContract(@ModelAttribute("contractDetail") ContractDetail contractDetail) {
        contractDetailService.remove(contractDetail.getId());
        return "redirect:list-contractDetail";

    }
}
