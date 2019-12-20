package com.ljs.controller;

import com.ljs.pojo.User;
import com.ljs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Usercontroller {

    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "userList";
    }
    @RequestMapping("save")
    public void saveUser(User user){
        userService.saveUser(user);
    }

}
