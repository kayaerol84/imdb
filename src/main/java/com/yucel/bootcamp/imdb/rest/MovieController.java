package com.yucel.bootcamp.imdb.rest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private static final Map<Integer, String> movies = Map.of(1, "The Lord of the Rings", 2, "Parasite", 3, "Schindler's List");

    //Creates a get endpoint
    @GetMapping
    public List<String> getMovies(){
        return List.of("The lord of the rings", "Parasite");
    }

    //Creates a get endpoint with additional path
    @GetMapping("{id}")
    public String getMoviesById(@PathVariable Integer id){
        return movies.get(id);
    }

    @GetMapping("v1")
    public String getMoviesByQueryId(@RequestParam Integer queryId){
        return movies.get(queryId);
    }
}
