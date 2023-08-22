package com.neebal.movieticket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieTicketBookingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieTicketBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hi Welcome to Capstone Project");
	}
}
