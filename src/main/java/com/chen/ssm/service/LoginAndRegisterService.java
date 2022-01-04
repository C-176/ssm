package com.chen.ssm.service;

import com.chen.ssm.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class LoginAndRegisterService {

    @Autowired
    private UserService userService;

    public ModelAndView loginAndRegister(String userName, Integer ID, String passWord, HttpSession session, String mode) {
        ModelAndView modelAndView = new ModelAndView();
//        SqlSession sqlsession = MyBatisUtil.getSqlsession();
//        UserDao mapper = sqlsession.getMapper(UserDao.class);
//        User user = mapper.queryUserByUserId(ID);
        switch (mode) {
            case "login":
                User user = userService.queryUserByUserId(ID);
                if (user == null) {
                    modelAndView.addObject("info", "你需要注册");
                    modelAndView.setViewName("ShowInfo");
                } else {
                    String name = user.getName();
                    String pwd = user.getPwd();
                    if (name.equals(userName) && pwd.equals(passWord)) {
                        session.setAttribute("user", userName);
                        modelAndView.addObject("user", userName);
                        modelAndView.setViewName("index");
                    } else {
                        if (!pwd.equals(passWord)) {
                            modelAndView.addObject("info", "密码错误");
                        } else {
                            modelAndView.addObject("info", "用户名错误");
                        }
                        modelAndView.setViewName("ShowInfo");
                    }

                }
                break;
            case "register":
                User byUserName = userService.queryUserByUserName(userName);
                User byUserId = userService.queryUserByUserId(ID);
                if (!(byUserName == null)) {
                    if (!(ID.equals(byUserName.getId()))) {
                        modelAndView.addObject("info", "用户名已被其他人注册");
                        modelAndView.setViewName("ShowInfo");
                    } else {
                        modelAndView.addObject("info", "你已注册");
                        modelAndView.setViewName("ShowInfo");
                    }
                } else if (!(byUserId == null)) {
                    if (!(userName.equals(byUserId.getName()))) {
                        modelAndView.addObject("info", "ID已被其他人注册");
                        modelAndView.setViewName("ShowInfo");
                    } else {
                        modelAndView.addObject("info", "你已注册");
                        modelAndView.setViewName("ShowInfo");
                    }
                } else {
                    User user1 = new User();
                    Date creatDate = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String formatDate = sdf.format(creatDate);
                    user1.setCreateDate(formatDate);
                    user1.setUpdateDate(formatDate);
                    user1.setName(userName);
                    user1.setId(ID);
                    user1.setPwd(passWord);
                    user1.setEmail("null");
                    Integer changedNum = userService.insertUser(user1);
                    User user2 = userService.queryUserByUserId(user1.getId());
                    if (!(user2 == null) & user2.getName().equals(userName) & changedNum == 1) {
                        modelAndView.addObject("info", "注册成功");

                        modelAndView.setViewName("ShowInfo");
                    } else {
                        modelAndView.addObject("info", "未注册成功");
                        modelAndView.setViewName("ShowInfo");
                    }
                }


        }

        return modelAndView;


    }
}
