package com.chen.ssm.controller;

import com.chen.ssm.service.LoginAndRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
public class LoginAndRegisterController {

    @Autowired
    private LoginAndRegisterService loginAndRegisterService;

    @RequestMapping("/LR")
    public ModelAndView loginAndRegister(String userName, Integer ID, String passWord, HttpSession session, String mode) {
        return loginAndRegisterService.loginAndRegister(userName, ID, passWord, session, mode);
    }
}


//    @Override
//    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//
//
//        String mode = request.getParameter("mode");
//        String username = request.getParameter("username");
//        long id = Long.parseLong(request.getParameter("id"));
//        String password = request.getParameter("password");
//        String usertype = request.getParameter("type");
//        System.out.println(mode+username+usertype+password);
//        SqlSession sqlsession = MyBatisUtil.getSqlsession();
//        QuestionGet mapper = sqlsession.getMapper(QuestionGet.class);
//        switch (mode){
//            case "login":
//                Student student = mapper.studentGet(id);
//                if (student == null){
//                    request.getSession().setAttribute("info","你需要注册。");
////                    response.sendRedirect("ShowInfo.jsp");
//                        request.getRequestDispatcher("ShowInfo.jsp").forward(request,response);
//                }else{
//                    String usernameGet = student.getUsername();
//                    long idGet = student.getId();
//                    String passwordGet = student.getPassword();
//                    if(passwordGet.equals(password) && usernameGet.equals(student.getUsername()) && idGet == student.getId()){
//                        request.getSession().setAttribute("user",username);
//                        request.getSession().setAttribute("usertype",usertype);
//                        response.sendRedirect("index.jsp");
//                        sqlsession.close();
//                        return;
//                    }else{
//                        request.getSession().setAttribute("info","你的某项信息错了。");
//                        response.sendRedirect("ShowInfo.jsp");
////                            response.sendRedirect("LoginAndRegisterController.html");  // 定向回登录界面
////                            request.getRequestDispatcher("LoginAndRegisterController.html").forward(request,response);
//
//                    }
//
//                }
//            case "register":
//                Student student1 = mapper.studentGet(id);
//                if (student1!= null){
//                    request.getSession().setAttribute("info","ID已被占用。");
//                    response.sendRedirect("ShowInfo.jsp");
////                        response.sendRedirect("LoginAndRegisterController.html");  // 定向回注册界面
//                }else{
//                    Student student2 = new Student(id,username,password);
//                    mapper.insertStudent(student2);
//                    sqlsession.commit();
//                    Student student3 = mapper.studentCheck(id);
//                    if (student3 != null){
//                        response.sendRedirect("LoginAndRegisterController.html");
//                        try {
//                            sqlsession.close();
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//
//                    }else {
//                        request.getSession().setAttribute("info","你没注册成功。");
//                        response.sendRedirect("ShowInfo.jsp");
////                            response.sendRedirect("LoginAndRegisterController.html");  // 定向回注册界面
//                    }
//                }
//        }
//    }

//}
