package com.practice.moviecatlogservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.practice.model.CatalogItem;
import com.practice.model.Movie;
import com.practice.model.Rating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {
	
	@Autowired
	private RestTemplate restTemplate;
	   @RequestMapping("/{userId}")
	    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		   
			
			Movie objMovie=restTemplate.getForObject("http://Movie-info-service/movies/"+userId, Movie.class);

		   return Collections.singletonList(new CatalogItem(objMovie.getName(), "Test Desc",Integer.parseInt( objMovie.getMovieId())));
	   

	    }

}
