package com.example.Moviesservice.Bean;

import java.util.Arrays;
import java.util.List;

import com.example.Moviesservice.Entity.MovieEntity;

public class Movies {

	
	
	private List<Movie> movies;
	
	private List<MovieEntity> moviesEntity;

	public List<MovieEntity> getMoviesEntity() {
		return moviesEntity;
	}

	public void setMoviesEntity(List<MovieEntity> moviesEntity) {
		this.moviesEntity = moviesEntity;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	public List<Movie> getAllMovies()
	{
		return this.movies = Arrays.asList(new Movie("Fast and Furious", "2010"),
				new Movie("Star Wars", "1977"),
				new Movie("Star Trek", "2008"),
				new Movie("Frozen", "2014"),
				new Movie("Torque", "2003"),
				new Movie("Middle man", "2010")
				);
	}
}
