package com.yucel.bootcamp.imdb.service;

import com.yucel.bootcamp.imdb.domain.Actor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ActorServiceTest {

    @Autowired
    ActorService actorService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getActors_shouldReturn_allActors() {
        List<String> actors = actorService.getActors();
        assertEquals(10, actors.size());
    }

    @Test
    void getActor_shouldFindActors_byName() {
        String name="Hugh Jackman";
        Actor actor = actorService.getActorByName(name);
    }
}