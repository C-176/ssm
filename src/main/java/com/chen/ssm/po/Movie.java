package com.chen.ssm.po;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Integer movieID;
    private String movieName;
    private String movieDetail;
    private String moviePicture;
    private String movieUrl;
    private String movieMainActress;

    @Override
    public String toString() {
        return "Movie{" +
                "movieID=" + movieID +
                ", movieName='" + movieName + '\'' +
                ", movieDetail='" + movieDetail + '\'' +
                ", moviePicture='" + moviePicture + '\'' +
                ", movieUrl='" + movieUrl + '\'' +
                ", movieMainActress='" + movieMainActress + '\'' +
                '}';
    }

    public Integer getMovieID() {
        return movieID;
    }

    public void setMovieID(Integer movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDetail() {
        return movieDetail;
    }

    public void setMovieDetail(String movieDetail) {
        this.movieDetail = movieDetail;
    }

    public String getMoviePicture() {
        return moviePicture;
    }

    public void setMoviePicture(String moviePicture) {
        this.moviePicture = moviePicture;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getMovieMainActress() {
        return movieMainActress;
    }

    public void setMovieMainActress(String movieMainActress) {
        this.movieMainActress = movieMainActress;
    }
}
