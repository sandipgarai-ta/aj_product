package com.all.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AllproductsApplication extends SpringBootServletInitializer {  //SpringBootServletInitializer for war only

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { //for war
        return application.sources(AllproductsApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(AllproductsApplication.class, args);
	}
}
