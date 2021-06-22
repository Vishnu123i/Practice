package com.studentservice.repository;

@FunctionalInterface
public interface Addition {
	
	public void add(int a,int b);
	//public void mul(int a,int b);


	default void sub(int a,int b) {
		
	}
static void div(int a,int b) {
		
	}
static void modulus(int a,int b) {
	
}
}
