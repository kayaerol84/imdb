package com.yucel.bootcamp.imdb.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    private static final Map<Integer, String> movies = Map.of(1, "The Lord of the Rings", 2, "Parasite", 3, "Schindler's List");

    public List<String> getMovies() {
      return new ArrayList<>(movies.values());
    }

    public String getMovie(Integer id) {
        return movies.get(id);
    }
}
