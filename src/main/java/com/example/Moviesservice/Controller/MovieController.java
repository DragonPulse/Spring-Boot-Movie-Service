package com.example.Moviesservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Moviesservice.Bean.Movie;
import com.example.Moviesservice.Bean.Movies;
import com.example.Moviesservice.Entity.MovieEntity;
import com.example.Moviesservice.Repository.MoviesDataRespository;
import com.example.Moviesservice.error.MovieNotFoundException;

import io.swagger.annotations.Api;

@RestController
@Api(description = "Endpoint for Product Composition data", tags = "MoviesComposition", basePath = "movies-service")
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	MoviesDataRespository moviesDataRespository;
	
	@RequestMapping("/all")
	public Movies getAllMovies()
	{
		return new Movies();
	}
	
	@RequestMapping("/create")
	public Movie createMovie()
	{
		MovieEntity movie = new MovieEntity();
		movie.setName("badshah");
		movie.setReleaseDate("1990");
		moviesDataRespository.save(movie);
		return new Movie(movie.getName(), movie.getReleaseDate());
	}
	
	@RequestMapping("/movie")
	public Movies getAllMoviesEntity()
	{
		List<MovieEntity> moviesList = (List<MovieEntity>) moviesDataRespository.findAll();
		Movies m = new Movies();
		m.setMoviesEntity(moviesList);
		return m;
	}
	
	@GetMapping("/{id}")
    MovieEntity findOne(@PathVariable int id) {
        return moviesDataRespository.findById(id)
                .orElseThrow(() -> new MovieNotFoundException(id));
    }
	
}
