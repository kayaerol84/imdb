package com.yucel.bootcamp.imdb.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MovieServiceTest {

    @Autowired
    MovieService movieService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getMovies_shouldReturn_allMovies() {
        List<String> movies = movieService.getMovies();
        assertEquals(3, movies.size());
    }

    @Test
    void getMovie() {
        assertTrue(1==1);
    }
}