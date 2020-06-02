package com.codegym.controller;

import com.codegym.model.Department;
import com.codegym.model.Level;
import com.codegym.service.DepartmentService;
import com.codegym.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/department")
    public ModelAndView showDepartment(){
        ModelAndView modelAndView = new ModelAndView("/department/create");
        modelAndView.addObject("department",new Department());
        return modelAndView;
    }
    @PostMapping("/create-department")
    public ModelAndView createDepartment(@ModelAttribute("department") Department department){
        departmentService.save(department);
        ModelAndView modelAndView = new ModelAndView("/department/create");
        modelAndView.addObject("department",new Department());
        modelAndView.addObject("message","Create new department success");
        return modelAndView;

    }
}
