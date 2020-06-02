package com.codegym.controller;

import com.codegym.model.Position;
import com.codegym.model.TypeService;
import com.codegym.service.PositionService;
import com.codegym.service.TypeServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PositionController {
    @Autowired
    PositionService positionService;
    @GetMapping("/position")
    public ModelAndView showPosition(){
        ModelAndView modelAndView = new ModelAndView("/position/create");
        modelAndView.addObject("position",new Position());
        return modelAndView;
    }
    @PostMapping("/create-position")
    public ModelAndView createTypeService(@ModelAttribute("position") Position position){
        positionService.save(position);
        ModelAndView modelAndView = new ModelAndView("/position/create");
        modelAndView.addObject("position",new Position());
        modelAndView.addObject("message","Create new position success");
        return modelAndView;

    }
}
