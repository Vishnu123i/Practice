package com.studentservice.repository;

public class MessageImpl {
	static void sendMessage() {
		System.out.println("message");
	}
	MessageImpl(){
		System.out.println("constructor calling");
	}
	public void sendMessage2() {
		System.out.println("instances method calling");
	}
	}


