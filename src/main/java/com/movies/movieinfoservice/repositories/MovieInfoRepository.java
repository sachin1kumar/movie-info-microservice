package com.movies.movieinfoservice.repositories;

import com.movies.movieinfoservice.models.MovieInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long> {
}
