package com.chen.ssm.controller;

import com.chen.ssm.service.SearchMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

@Controller
public class SearchMovieController {
    @Autowired
    private SearchMovieService searchMovieService;

    @RequestMapping(value = "/searchMovie")
    public String search(String searchInfo, HttpSession session) {
        try {
            searchInfo = new String(searchInfo.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        ModelAndView modelAndView = searchMovieService.queryMovieByName(searchInfo, session);
        return modelAndView.getViewName();
    }
}
