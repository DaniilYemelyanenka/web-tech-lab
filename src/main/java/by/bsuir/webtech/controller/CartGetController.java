package by.bsuir.webtech.controller;

import by.bsuir.webtech.Model.CartInfo;
import by.bsuir.webtech.entity.Product;
import by.bsuir.webtech.repository.ProductRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
public class CartGetController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/cart/add")
    public String addToCart(@RequestParam("id") int id, HttpSession httpSession){
        Product product  = productRepository.findById(id).orElse(null);
        if(product != null) {
            CartInfo cartInfo = (CartInfo) httpSession.getAttribute("cartInfo");
            if (cartInfo == null) {
                cartInfo = new CartInfo(0.0, 0);
            }

            cartInfo.setItemCount(cartInfo.getItemCount() + 1);
            cartInfo.setTotalPrice(cartInfo.getTotalPrice() + product.getCount()); // count как цена?

            httpSession.setAttribute("cartInfo", cartInfo);
        }
        return "redirect:/product";
    }

}
