package com.example.service;

import com.example.bean.MovieCatalogList;


public interface CatalogService {

	MovieCatalogList findMovieCatalogByUserId(String id);
}
