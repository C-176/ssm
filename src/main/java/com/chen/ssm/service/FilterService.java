package com.chen.ssm.service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebFilter("/*")
public class FilterService implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化。。。");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        System.out.println(uri);
        // 静态资源释放
        if (uri.contains("/css") || uri.contains("/JavaScript") || uri.contains("/iconfont") || uri.contains("/source")) {
            filterChain.doFilter(request, response);
        }
        // 无需登录界面释放
        else if (uri.contains("index.html") || uri.contains("LoginAndRegisterController.html") || uri.contains("doubleCity.html") || uri.contains("ShowInfo.jsp")) {
            filterChain.doFilter(request, response);
        } else if (uri.contains("LoginAndRegisterController") || uri.contains("mybatis-mapper.xml") || uri.contains("mybatis-config.xml")) {
            filterChain.doFilter(request, response);
        }
        // 已登录状态释放
        else if (request.getAttribute("user") != null) {
            filterChain.doFilter(request, response);
        } else {
            response.sendRedirect("loginAndRegister.html");
        }

    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁。。。");
    }
}
