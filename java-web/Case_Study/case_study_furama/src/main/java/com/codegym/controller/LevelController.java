package com.codegym.controller;

import com.codegym.model.Level;
import com.codegym.model.Position;
import com.codegym.service.LevelService;
import com.codegym.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class LevelController {
    @Autowired
    LevelService levelService;
    @GetMapping("/level")
    public ModelAndView showLevel(){
        ModelAndView modelAndView = new ModelAndView("/level/create");
        modelAndView.addObject("level",new Level());
        return modelAndView;
    }
    @PostMapping("/create-level")
    public ModelAndView createLevel(@ModelAttribute("level") Level level){
        levelService.save(level);
        ModelAndView modelAndView = new ModelAndView("/level/create");
        modelAndView.addObject("level",new Level());
        modelAndView.addObject("message","Create new level success");
        return modelAndView;

    }
}
