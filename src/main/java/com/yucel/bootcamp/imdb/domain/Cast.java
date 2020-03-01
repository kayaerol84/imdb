package com.yucel.bootcamp.imdb.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Cast {
    private List<Actor> actors;
}
