package com.ylx.controller;

import com.ylx.model.User_2;
import com.ylx.service.User_2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping(value = "User_2Controller")
public class User_2Controller {
    @Autowired
    @Qualifier("User_2Service")
    private User_2Service user_2Service;

    @RequestMapping(value = "main")
    public String main(Model model) {
        List<User_2> user_2List = user_2Service.getAll();
        model.addAttribute("user_2List",user_2List);
        return "main";

    }
}
