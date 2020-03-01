package com.yucel.bootcamp.imdb.rest;

import com.yucel.bootcamp.imdb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    //Autowire: Dependency injection
    @Autowired
    private MovieService movieService;


    //Creates a get endpoint
    @GetMapping
    public List<String> getMovies(){
        return movieService.getMovies();
    }

    //Creates a get endpoint with additional path
    @GetMapping("{id}")
    public String getMoviesById(@PathVariable Integer id){
        return movieService.getMovie(id);
    }

    @GetMapping("v1")
    public String getMoviesByQueryId(@RequestParam Integer queryId){
        return movieService.getMovie(queryId);
    }
}
