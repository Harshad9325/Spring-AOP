package com.AOP.service;

public class paymentServiceImpl implements paymentService {

	public void makePayment(int amount) {
		
		//payment code
		System.out.println(amount+"Amount debited");
		//
		//
		//
		System.out.println(amount+"Amount credited");
	}

}
