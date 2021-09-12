package com.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.bean.MovieCatalogList;
import com.example.service.CatalogService;


@RestController
public class CatalogResource {

	@Autowired
	private CatalogService catalogService;
	
	@GetMapping(value = "/catalog/{id}",produces = "application/json")
	public MovieCatalogList getMovieCatalogById(@PathVariable("id") String userId) {
		return catalogService.findMovieCatalogByUserId(userId);
	}
}
