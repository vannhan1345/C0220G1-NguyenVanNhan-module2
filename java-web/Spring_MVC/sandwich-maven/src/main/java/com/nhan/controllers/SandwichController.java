package com.nhan.controllers;

import com.nhan.models.Sandwich;
import com.nhan.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SandwichController {
    @Autowired
    SandwichService sandwichService;
    @GetMapping("/")
    String getHome(Model model) {
        model.addAttribute("sandwich", new Sandwich(false,false,false,false));
        return "index";
    }

    @PostMapping("/save")
    public String showCondiments(@ModelAttribute Sandwich sandwich, Model model) {
        String result = sandwichService.getList(sandwich);
        if(result.equals("")){
            model.addAttribute("no_choose", "No choose");
        }else{
            model.addAttribute("condiment", result.substring(0,result.length()-2));
        }
        return "display";
    }

}