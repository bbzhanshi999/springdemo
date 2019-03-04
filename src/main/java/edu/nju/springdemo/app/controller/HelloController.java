package edu.nju.springdemo.app.controller;

import edu.nju.springdemo.app.model.Role;
import edu.nju.springdemo.app.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model,HttpSession session){

        model.addAttribute("content","hello spring !哈哈");

        List<User> userList = new ArrayList<>();

        userList.add(new User(1,"张三",new Role(1,"admin"),new Date()));
        userList.add(new User(2,"李四",new Role(1,"client"),new Date()));
        userList.add(new User(3,"王五",new Role(1,"admin"),new Date()));
        userList.add(new User(4,"赵柳",new Role(1,"client"),new Date()));
        userList.add(new User(5,"天气",new Role(1,"client"),new Date()));

        model.addAttribute("userList",userList);
        model.addAttribute("userList",userList);
        session.setAttribute("user",new User(5,"天气",new Role(1,"client"),new Date()));
        return "hello";
    }
}
