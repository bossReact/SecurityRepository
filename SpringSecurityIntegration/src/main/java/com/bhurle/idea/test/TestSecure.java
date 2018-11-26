package com.bhurle.idea.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TestSecure {
public static void main(String[] args) {
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	System.out.println(encoder.encode("saurabh"));
	boolean flag=encoder.matches("saurabh", "");
	
	System.out.println(flag);
	
}
}
