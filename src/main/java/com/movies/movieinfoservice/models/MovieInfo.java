package com.movies.movieinfoservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "catalog_items")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class MovieInfo {

    @Id
    private Long movieid;
    private String
}
