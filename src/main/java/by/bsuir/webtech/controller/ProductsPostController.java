package by.bsuir.webtech.controller;

import by.bsuir.webtech.entity.Product;
import by.bsuir.webtech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsPostController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products/add-product")
    private String addPoducts(){
        Product product = new Product("лазанья",12.0,"1.png");
        Product product1 = new Product("драники",13.0,"2.png");
        Product product2 = new Product("борщ",11.0,"3.png");
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);
        products.add(product2);

        productRepository.saveAll(products);
        return "product";
    }
}
