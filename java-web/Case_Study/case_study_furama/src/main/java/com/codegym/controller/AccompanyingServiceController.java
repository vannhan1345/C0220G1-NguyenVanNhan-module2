package com.codegym.controller;

import com.codegym.model.AccompanyingService;
import com.codegym.model.TypeRent;
import com.codegym.service.AccompanyingServiceService;
import com.codegym.service.TypeRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccompanyingServiceController {
    @Autowired
    AccompanyingServiceService accompanyingServiceService;

    @GetMapping("/accompanying")
    public ModelAndView showAccompanyingService() {
        ModelAndView modelAndView = new ModelAndView("/accompanyingService/create");
        modelAndView.addObject("accompanying", new AccompanyingService());
        return modelAndView;
    }

    @PostMapping("/create-accompanying")
    public ModelAndView createTypeRent(@ModelAttribute("accompanying") AccompanyingService accompanyingService) {
        accompanyingServiceService.save(accompanyingService);
        ModelAndView modelAndView = new ModelAndView("/accompanyingService/create");
        modelAndView.addObject("accompanying", new AccompanyingService());
        modelAndView.addObject("message", "Create new Accompanying Service success");
        return modelAndView;
    }
}
