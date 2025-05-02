package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.Product;
import by.bsuir.webtech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductsGetController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public String getProducts(Model model){
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "product";
    }
}
