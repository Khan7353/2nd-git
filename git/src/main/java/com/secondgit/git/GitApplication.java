package com.secondgit.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitApplication.class, args);
		int a=10;
		int b=12;
		if(a==b){
		System.out.print("Hi Pommi");
		}
		else
		{
		System.out.print("pommi");
		}
		
	}

}
