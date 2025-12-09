package com.pluralsight.northwindtradersspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class NorthwindtradersspringbootApplication {

    static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(NorthwindtradersspringbootApplication.class, args);
	}
}
