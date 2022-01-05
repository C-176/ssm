package com.chen.ssm.controller;

import com.chen.ssm.service.SearchMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class SearchMovieController {
    @Autowired
    private SearchMovieService searchMovieService;

    @RequestMapping(value = "/searchMovie")
    public String search(@RequestParam() String searchInfo, HttpSession session) {
//        searchInfo = new String(searchInfo.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        ModelAndView modelAndView = searchMovieService.queryMovieByName(searchInfo, session);
        return modelAndView.getViewName();
    }
}
