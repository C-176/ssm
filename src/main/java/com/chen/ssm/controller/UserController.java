package com.chen.ssm.controller;

import com.chen.ssm.po.User;
import com.chen.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        // 调用service 层查询方法
        User user = userService.queryUserByUserId(0);
        mv.addObject("user", user);
        mv.setViewName("hello");
        return mv;

    }

}
