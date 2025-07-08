package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Movie;
import com.example.demo.Repo.MovieRepo;

@Service
public class MovieService {
	@Autowired
	MovieRepo mr;
	public void saveMovieDetails(Movie m)
	{
		mr.save(m);
		
	}
	public void deleteMovieDetails(int id)
	{
		mr.deleteById(id);
	}

}
