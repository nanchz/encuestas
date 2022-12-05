package com.springboot.satisfaccion.servicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SatisfaccionServicioApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SatisfaccionServicioApplication.class, args);
	}

}
