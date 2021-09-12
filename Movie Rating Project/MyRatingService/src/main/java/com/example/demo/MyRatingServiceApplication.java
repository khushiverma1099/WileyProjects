package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.bean.Rating;
import com.example.persistence.RatingDao;

@SpringBootApplication(scanBasePackages = "com.example")
@EntityScan(basePackages = "com.example.bean")
@EnableJpaRepositories(basePackages = "com.example.persistence")
public class MyRatingServiceApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private RatingDao ratingDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MyRatingServiceApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		ratingDao.save(new Rating("R1","U1",1,3));
//		ratingDao.save(new Rating("R2","U1",2,4));
//		ratingDao.save(new Rating("R3","U2",4,2));
//		ratingDao.save(new Rating("R4","U3",3,5));
//		ratingDao.save(new Rating("R5","U2",5,1));
//		
//		
//	}

}
