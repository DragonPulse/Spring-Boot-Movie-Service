package com.example.Moviesservice.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Moviesservice.Entity.MovieEntity;

public interface MoviesDataRespository extends CrudRepository<MovieEntity, Integer> {

}
