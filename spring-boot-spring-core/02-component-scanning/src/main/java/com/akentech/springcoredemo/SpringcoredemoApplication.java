package com.akentech.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* Component scanning with java files being transferred to a util folder
@SpringBootApplication(
		scanBasePackages = {"com.akentech.springcoredemo",
		                     "com.akentech.util"}

)
 */
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
