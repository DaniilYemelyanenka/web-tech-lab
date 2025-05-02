package by.bsuir.webtech.advice;

import by.bsuir.webtech.Model.CartInfo;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class CartAdvice {

    @ModelAttribute("cartInfo")
    public CartInfo cartInfo(HttpSession httpSession){

        CartInfo cartInfo = (CartInfo)httpSession.getAttribute("cartInfo");
        if (cartInfo == null){
            cartInfo = new CartInfo(0.00, 0);
            httpSession.setAttribute("cartInfo", cartInfo);
        }
        return cartInfo;
    }
}
