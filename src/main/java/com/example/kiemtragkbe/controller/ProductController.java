package com.example.kiemtragkbe.controller;

import com.example.kiemtragkbe.model.Product;
import com.example.kiemtragkbe.respository.IProductRepo;
import com.example.kiemtragkbe.service.IProductService;
import com.example.kiemtragkbe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("")
    public String home(Model model) {

        model.addAttribute("listProduct", iProductService.findAll());
        return "/home";
    }

    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable("id") int id, Model model) {
        Optional<Product> product = iProductService.findById(id);
        Product productModel = new Product(product.get().getId(),product.get().getName(),product.get().getDescribes(),product.get().getPrice(),product.get().getManufacture());
        model.addAttribute("productModel", productModel);
        return "/update";
    }

    @PostMapping("/edit ")
    public String update(Product product) {
        iProductService.edit(new Product(product.getId(), product.getName(), product.getDescribes(), product.getPrice(), product.getManufacture()));
        return "redirect:/products";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        iProductService.remove(id);
        return "redirect:/products";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {

        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Product product, Model model) {

        iProductService.save(product);
        return "redirect:/products";
    }

    @GetMapping("/{id}/view")
    public String showView(@PathVariable int id, Model model) {

        Optional<Product> product = iProductService.findById(id);
        Product productModel = new Product(product.get().getId(),product.get().getName(),product.get().getDescribes(),product.get().getPrice(),product.get().getManufacture());
        model.addAttribute("listProduct", productModel);
        return "/view";
    }
}
