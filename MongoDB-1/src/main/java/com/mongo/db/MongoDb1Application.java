package com.mongo.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MongoDb1Application extends SpringBootServletInitializer{
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	public static void main(String[] args) {
		SpringApplication.run(MongoDb1Application.class, args);
	}


}

