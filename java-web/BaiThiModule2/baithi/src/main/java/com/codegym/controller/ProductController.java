package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.model.TypeProduct;
import com.codegym.service.ProductService;
import com.codegym.service.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@Controller
public class ProductController {
    @Autowired
   private ProductService productService;

    @Autowired
    TypeProductService typeProductService;



    @ModelAttribute("typeProduct")
    public List<TypeProduct> showTypeTypeProduct() {
        return typeProductService.findAll();
    }

    @GetMapping("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/product/create");
        Product product = new Product();
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/create-product")
    public ModelAndView saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/product/create");
            return modelAndView;
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("message", "Add new product success!");

        return modelAndView;
    }

    @GetMapping("/list-product")
    public ModelAndView showListProduct(@RequestParam("keyword") Optional<String> keyword, Pageable pageable) {
        Pageable pageableSortById = PageRequest.of(pageable.getPageNumber(), 3, Sort.by("name").ascending());
        String keywordLast = null;
        Page<Product> products;
        if (keyword.isPresent()) {
            keywordLast = keyword.get();
            products = productService.findAllByNameContaining(keywordLast, pageableSortById);


        } else {
            products = productService.findAll(pageableSortById);
        }
        ModelAndView modelAndView = new ModelAndView("/product/list");
        modelAndView.addObject("listProducts", products);
        modelAndView.addObject("keyword", keywordLast);
        return modelAndView;
    }

    @GetMapping("/edit-product/{id}")
    public ModelAndView showEditProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("product", product);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }

    @PostMapping("/edit-product")
    public ModelAndView updateProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            return modelAndView;
        }
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Update customer success!");
        return modelAndView;
    }

    @GetMapping("/delete-product/{id}")
    public ModelAndView showDeleteProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product != null) {
            ModelAndView modelAndView = new ModelAndView("/product/delete");
            modelAndView.addObject("products", product);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }

    }


    @PostMapping("/delete-product")
    public String RemoveProduct(@ModelAttribute("product") Product product, Model model) {

        productService.remove(product.getId());

        return "redirect:/list-product";

    }
}
