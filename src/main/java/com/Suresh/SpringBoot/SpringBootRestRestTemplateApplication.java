package com.Suresh.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootRestRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestRestTemplateApplication.class, args);

		
		  RestTemplate template = new RestTemplate();
		  
		  String url = "https://quoters.apps.pcfone.io/api/random";
		  ResponseEntity<String> entity = template.getForEntity(url, String.class);
		  String body = entity.getBody(); 
		  System.out.println(body);
		 

	}

	/*
	 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
	 * builder.build(); }
	 * 
	 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
	 * Exception { return args -> { Quote quote =
	 * restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random",
	 * Quote.class); log.info(quote.toString()); }; }
	 */
}
