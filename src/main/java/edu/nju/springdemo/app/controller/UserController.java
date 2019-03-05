package edu.nju.springdemo.app.controller;

import com.github.pagehelper.PageInfo;
import edu.nju.springdemo.app.model.User;
import edu.nju.springdemo.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/find")
    @ResponseBody
    public User find(User condition){
        return  userService.find(condition);
    }

    @RequestMapping("/find/{id}")
    @ResponseBody
    public User findById(@PathVariable("id") Long id){
        return  userService.findById(id);
    }

    @RequestMapping("/findList")
    @ResponseBody
    public PageInfo<User> findList(User condition,Integer pageNum,Integer pageSize){
        return userService.pageInfo(pageNum,pageSize,condition);
    }

    @RequestMapping("/page/update/{id}")
    public String update(@PathVariable("id") Long id,Model model){
        model.addAttribute("target",userService.findById(id));
        return "user/form";
    }
}
