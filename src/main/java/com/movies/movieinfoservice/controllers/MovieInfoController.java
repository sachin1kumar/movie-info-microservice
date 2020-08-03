package com.movies.movieinfoservice.controllers;

import com.movies.movieinfoservice.models.MovieInfo;
import com.movies.movieinfoservice.repositories.MovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    @Autowired
    private MovieInfoRepository movieInfoRepository;

    @RequestMapping("/{movieid}")
    public MovieInfo getMovie(@PathVariable Long movieid){
        return movieInfoRepository.getOne(movieid);
    }
}
