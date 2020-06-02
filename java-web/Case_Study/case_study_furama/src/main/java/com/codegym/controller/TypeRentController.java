package com.codegym.controller;

import com.codegym.model.TypeRent;
import com.codegym.model.TypeService;
import com.codegym.service.TypeRentService;
import com.codegym.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TypeRentController {
    @Autowired
    TypeRentService typeRentService;

    @GetMapping("/typeRent")
    public ModelAndView showTypeRent() {
        ModelAndView modelAndView = new ModelAndView("/typerent/create");
        modelAndView.addObject("typeRent", new TypeRent());
        return modelAndView;
    }

    @PostMapping("/create-typerent")
    public ModelAndView createTypeRent(@ModelAttribute("typerent") TypeRent typeRent) {
        typeRentService.save(typeRent);
        ModelAndView modelAndView = new ModelAndView("/typerent/create");
        modelAndView.addObject("typeRent", new TypeRent());
        modelAndView.addObject("message", "Create new type Rent success");
        return modelAndView;
    }
}