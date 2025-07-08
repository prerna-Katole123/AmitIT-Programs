package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Movie;
import com.example.demo.Service.MovieService;
@RestController
public class MovieController {
	
	@Autowired
	MovieService ms;
	
	@PostMapping("add")
	String addMovieDetails(@RequestBody Movie m)
	{
		ms.saveMovieDetails(m);
		return"movie details added";
	}
	@DeleteMapping("delete/{id}")
	String deleteMovie(@PathVariable int id)
	{
		ms.deleteMovieDetails(id);
		return"movie details deleted";
	}

}
