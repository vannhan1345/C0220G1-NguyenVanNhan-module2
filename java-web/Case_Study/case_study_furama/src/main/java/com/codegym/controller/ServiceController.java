package com.codegym.controller;


import com.codegym.model.Service;
import com.codegym.model.TypeCustomer;
import com.codegym.model.TypeRent;
import com.codegym.model.TypeService;
import com.codegym.service.ServiceService;
import com.codegym.service.TypeRentService;
import com.codegym.service.TypeServiceService;
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
public class ServiceController {
    @Autowired
    ServiceService serviceService;
@Autowired
    TypeServiceService typeServiceService;
@Autowired
    TypeRentService typeRentService;

    @ModelAttribute("typeservice")
    public List<TypeService> showTypeService() {
        return typeServiceService.findAll();
    }
    @ModelAttribute("typerent")
    public List<TypeRent> showTypeRent() {
        return typeRentService.findAll();
    }

    @GetMapping("/service")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/service/create");
        Service service = new Service();
        modelAndView.addObject("service", service);
        return modelAndView;
    }

    @PostMapping("/create-service")
    public ModelAndView saveService(@ModelAttribute("service") Service service) {
        serviceService.save(service);
        ModelAndView modelAndView = new ModelAndView("/service/create");
        modelAndView.addObject("service", new Service());
        modelAndView.addObject("message", "Add new service success!");
        return modelAndView;
    }

    @GetMapping("/list-service")
    public ModelAndView showListService(@RequestParam("keyword") Optional<String> keyword, Pageable pageable) {
        Pageable pageableSortById = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("name").ascending());
        String keywordLast = null;
        Page<Service> services;
        if (keyword.isPresent()) {
            keywordLast = keyword.get();
            services = serviceService.findAllByNameContaining(keywordLast, pageableSortById);



        } else {
            services = serviceService.findAll(pageableSortById);
        }
        ModelAndView modelAndView = new ModelAndView("/service/list");
        modelAndView.addObject("listservice", services);
        modelAndView.addObject("keyword", keywordLast);
        return modelAndView;
    }

    @GetMapping("/edit-service/{id}")
    public ModelAndView showEditService(@PathVariable Long id) {
        Service service = serviceService.findById(id);
        if (service != null) {
            ModelAndView modelAndView = new ModelAndView("/service/edit");
            modelAndView.addObject("service", service);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/edit-service")
    public ModelAndView updateService(@ModelAttribute("service") Service service) {
        serviceService.save(service);
        ModelAndView modelAndView = new ModelAndView("/service/edit");
        modelAndView.addObject("service", service);
        modelAndView.addObject("message", "Update service success!");
        return modelAndView;
    }

    @GetMapping("/delete-service/{id}")
    public ModelAndView showDeleteService(@PathVariable Long id) {
        Service service = serviceService.findById(id);
        if (service != null) {
            ModelAndView modelAndView = new ModelAndView("/service/delete");
            modelAndView.addObject("service", service);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/delete-service")
    public String RemoveService(@ModelAttribute("service") Service service) {
        serviceService.remove(service.getId());
        return "redirect:list-service";

    }


}
