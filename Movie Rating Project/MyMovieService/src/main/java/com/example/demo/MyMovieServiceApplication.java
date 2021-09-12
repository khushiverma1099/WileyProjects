package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.Movie;
import com.example.persistence.MovieDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class MyMovieServiceApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private MovieDao movieDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MyMovieServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		movieDao.save(new Movie(1,"Kal Ho Na Ho"));
//		movieDao.save(new Movie(2,"Kuch Kuch Hota Hai"));
//		movieDao.save(new Movie(3,"Dilwale"));
//		movieDao.save(new Movie(4,"Street Dancer"));
//		movieDao.save(new Movie(5,"Shershaah"));
//	}

}
