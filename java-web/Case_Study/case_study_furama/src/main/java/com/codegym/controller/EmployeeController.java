package com.codegym.controller;

import com.codegym.model.*;
import com.codegym.service.DepartmentService;
import com.codegym.service.EmployeeService;
import com.codegym.service.LevelService;
import com.codegym.service.PositionService;
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
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @Autowired
    PositionService positionService;
    @Autowired
    LevelService levelService;
    @Autowired
    DepartmentService departmentService;


    @ModelAttribute("position")
    public List<Position> showPosition() {
        return positionService.findAll();
    }
    @ModelAttribute("level")
    public List<Level> showLevel() {
        return levelService.findAll();
    }
    @ModelAttribute("department")
    public List<Department> showDepartment() {
        return departmentService.findAll();
    }
    @GetMapping("/employee")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        Employee employee = new Employee();
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("message", "Add new employee success!");
        return modelAndView;
    }

    @GetMapping("/list-employee")
    public ModelAndView showListEmployee(@RequestParam("keyword") Optional<String> keyword, Pageable pageable) {
        Pageable pageableSortById = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("name").ascending());
        String keywordLast = null;
        Page<Employee> employees;
        if (keyword.isPresent()) {
            keywordLast = keyword.get();
            employees = employeeService.findAllByNameContaining(keywordLast, pageableSortById);



        } else {
            employees = employeeService.findAll(pageableSortById);
        }
        ModelAndView modelAndView = new ModelAndView("/employee/list");
        modelAndView.addObject("listemployee", employees);
        modelAndView.addObject("keyword", keywordLast);
        return modelAndView;
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView showEditEmployee(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            modelAndView.addObject("employee", employee);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/edit-employee")
    public ModelAndView updateEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("/employee/edit");
        modelAndView.addObject("employee", employee);
        modelAndView.addObject("message", "Update employee success!");
        return modelAndView;
    }

    @GetMapping("/delete-employee/{id}")
    public ModelAndView showDeleteEmployee(@PathVariable Long id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            ModelAndView modelAndView = new ModelAndView("/employee/delete");
            modelAndView.addObject("employee", employee);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/delete-employee")
    public String RemoveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.remove(employee.getId());
        return "redirect:list-employee";

    }

}
