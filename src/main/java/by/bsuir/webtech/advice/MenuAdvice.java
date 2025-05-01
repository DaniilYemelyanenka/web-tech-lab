package by.bsuir.webtech.advice;

import by.bsuir.webtech.Model.MenuItems;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MenuAdvice {

    @ModelAttribute
    public void addMenuToModel(Model model, HttpServletRequest httpServletRequest){
        String uri = httpServletRequest.getRequestURI();

        List<MenuItems> menuItems = new ArrayList<>();
        menuItems.add(new MenuItems(true, "", "", "/", "index", "", "Lab 2"));
        menuItems.add(new MenuItems(false, "", "", "/product", "product", "", "Каталог"));
        menuItems.add(new MenuItems(false, "", "", "/admin", "admin", "", "Администрирование"));

        for (MenuItems item : menuItems) {
            if (uri.equalsIgnoreCase(item.getController())) {
                item.setActive("active");
            } else {
                item.setActive("");
            }
        }

        model.addAttribute("menu",menuItems);
    }
}
