package com.arcreane.LDVLEH.controller;

import com.arcreane.ldvelh.controller.IController;
import com.arcreane.ldvelh.controller.MenuType;
import com.arcreane.ldvelh.model.Book;
import com.arcreane.ldvelh.service.IService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Setter
@Getter
public class WebController implements IController {

    @Autowired
    private IService service;
    //    private PlayerService playerService;

    @RequestMapping("/display-home")
    public String display(HttpServletRequest request) {
        System.out.println("Coucou on est passé par là");
        var list = service.getExistingBookList();
        request.setAttribute("BookList", service.getExistingBookList());
        return "display-home";
    }
    @RequestMapping("/display-home2")
    @ModelAttribute("BookList")
    public List<Book> display(){
        System.out.println("on passe par ici aussi");
        return service.getExistingBookList();
    }
    @Override
    public String getUserSelection() {
        return null;
    }

    @Override
    public void startApp() {

    }

    @Override
    public void showMenu(MenuType type) {

    }

    @Override
    public void createBook() {

    }

    @Override
    public void modifyBook() {

    }

    @Override
    public void createNewChapter() {

    }

    @Override
    public void saveChanges() {

    }

    @Override
    public void linkOptions() {

    }

    @Override
    public void setService(IService myService) {

    }

}
