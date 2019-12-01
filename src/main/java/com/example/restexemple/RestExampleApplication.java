package com.example.restexemple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestExampleApplication {

	private static final Logger log = LoggerFactory.getLogger(RestExampleApplication.class);

	public static void main(String[] args) {
		log.info("==== RESTful API  START =======");
		System.out.println("TESTE");
		SpringApplication.run(RestExampleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		Response response = restTemplate.getForObject("http://services.groupkt.com/country/get/iso2code/IN",
				Response.class);
		log.info("==== RESTful API Response using Spring RESTTemplate START =======");
		log.info(response.toString());
		log.info("==== RESTful API Response using Spring RESTTemplate END =======");
	}

}
