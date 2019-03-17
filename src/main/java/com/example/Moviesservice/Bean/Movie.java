package com.example.Moviesservice.Bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@Data
@ToString
public class Movie {

	public Movie(String name, String releaseYear) {
		this.name = name;
		this.releaseYear = releaseYear;
	}
	
	private String name;
	
	private String releaseYear;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
}
