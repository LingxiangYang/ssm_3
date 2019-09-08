package com.ylx.controller;

import com.ylx.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/UserController")
public class UserController {
    @RequestMapping(value = "/{formName}")
    public String loginname(
            @PathVariable String formName,
            Model model
    ){
        User user = new User();
        model.addAttribute("user",user);
        return formName;
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(
            @Valid @ModelAttribute User user,
            Errors errors,
            Model model){
        System.out.println(user);
        if(errors.hasErrors()){
            return "registerForm";
        }
        model.addAttribute("user",user);
        return "success";
    }
}
