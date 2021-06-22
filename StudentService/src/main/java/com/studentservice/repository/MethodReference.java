package com.studentservice.repository;

public class MethodReference {
public static void main(String[] args) {
	Message message = MessageImpl::sendMessage;
	message.send();

	Message message1 =MessageImpl::new;
	message1.send();
	MessageImpl message2 =new MessageImpl();
	Message message3 = message2::sendMessage2;
	 message3.send();
	}
}
