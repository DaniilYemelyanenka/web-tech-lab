package by.bsuir.webtech.advice;

import by.bsuir.webtech.Model.CartInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class CartAdvice {

    @ModelAttribute("cartInfo")
    public CartInfo cartInfo(){
        return new CartInfo(1500.00,3);
    }
}
