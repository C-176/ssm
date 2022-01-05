package com.chen.ssm.service;

import com.chen.ssm.dao.MovieDao;
import com.chen.ssm.po.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Service
public class SearchMovieService {
    @Autowired
    private MovieDao movieDao;

    public ModelAndView queryMovieByName(String searchInfo, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        ArrayList<Movie> movies = movieDao.queryMovieByName(searchInfo);
        if (movies.size() != 0) {
            session.setAttribute("movieList", movies);
        } else {
            ArrayList<Movie> movies1 = movieDao.queryMovieByKeyword(searchInfo);
            session.setAttribute("movieList", movies1);
        }
        session.setAttribute("searchInfo", searchInfo);
        modelAndView.setViewName("ShowVideo");
        return modelAndView;
    }
}
