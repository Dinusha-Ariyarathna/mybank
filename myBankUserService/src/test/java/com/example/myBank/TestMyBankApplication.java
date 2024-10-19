package com.example.myBank;

import org.springframework.boot.SpringApplication;

public class TestMyBankApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyBankApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
