package com.codegym.controller;

import com.codegym.model.TypeProduct;
import com.codegym.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TypeProductController {
    @Autowired
    TypeProductService typeProductService;
    @GetMapping("/typeProduct")
    public ModelAndView showTypeProduct(){
        ModelAndView modelAndView = new ModelAndView("/typeProduct/create");
        modelAndView.addObject("typeProduct",new TypeProduct());
        return modelAndView;
    }
    @PostMapping("/create-typeProduct")
    public ModelAndView modelAndView(@ModelAttribute("typeProduct") TypeProduct typeProduct){
        typeProductService.save(typeProduct);
        ModelAndView modelAndView = new ModelAndView("/typeProduct/create");
        modelAndView.addObject("typeProduct",new TypeProduct());
        modelAndView.addObject("message","Create new type product success");
        return modelAndView;

    }
}
