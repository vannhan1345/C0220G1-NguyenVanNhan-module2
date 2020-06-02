package com.codegym.controller;

import com.codegym.model.TypeCustomer;
import com.codegym.model.TypeService;
import com.codegym.service.TypeCustomerService;
import com.codegym.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TypeServiceController {
    @Autowired
    TypeServiceService typeServiceService;
    @GetMapping("/typeService")
    public ModelAndView showTypeService(){
        ModelAndView modelAndView = new ModelAndView("/typeservice/create");
        modelAndView.addObject("typeService",new TypeService());
        return modelAndView;
    }
    @PostMapping("/create-typeservice")
    public ModelAndView createTypeService(@ModelAttribute("typeService") TypeService typeService){
        typeServiceService.save(typeService);
        ModelAndView modelAndView = new ModelAndView("/typeservice/create");
        modelAndView.addObject("typeService",new TypeService());
        modelAndView.addObject("message","Create new type service success");
        return modelAndView;

    }
}
