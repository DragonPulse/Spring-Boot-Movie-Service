package com.example.Moviesservice.error;

public class MovieNotFoundException extends RuntimeException{

	public MovieNotFoundException(int id) {
        super("Book id not found : " + id);
    }
}
