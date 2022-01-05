package com.chen.ssm.dao;

import com.chen.ssm.po.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MovieDao {
    public ArrayList<Movie> queryMovieByName(String movieName);

    public ArrayList<Movie> queryMovieByKeyword(String Keyword);
}
