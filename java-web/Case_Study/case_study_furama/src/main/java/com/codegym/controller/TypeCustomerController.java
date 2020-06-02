package com.codegym.controller;

import com.codegym.model.TypeCustomer;
import com.codegym.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TypeCustomerController {
    @Autowired
    TypeCustomerService typeCustomerService;
    @GetMapping("/typeCustomer")
    public ModelAndView showTypeCustomer(){
        ModelAndView modelAndView = new ModelAndView("/typecustomer/create");
        modelAndView.addObject("typeCustomer",new TypeCustomer());
        return modelAndView;
    }
    @PostMapping("/create-typecustomer")
    public ModelAndView modelAndView(@ModelAttribute("typeCustomer") TypeCustomer typeCustomer){
        typeCustomerService.save(typeCustomer);
        ModelAndView modelAndView = new ModelAndView("/typecustomer/create");
        modelAndView.addObject("typeCustomer",new TypeCustomer());
        modelAndView.addObject("message","Create new type customer success");
        return modelAndView;

    }
//    @PostMapping("createTypeCustomer")
//    public String createTypeCustomer(@ModelAttribute("typeCustomer") TypeCustomer typeCustomer, Model model){
//        typeCustomerService.save(typeCustomer);
//        model.addAttribute("message", "Ok");
//        return "typecustomer/create";
//    }

}
