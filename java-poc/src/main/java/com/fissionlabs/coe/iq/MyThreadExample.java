package com.fissionlabs.coe.iq;

public class MyThreadExample implements Runnable {

	@Override
	public void run() {
	   System.out.println("this is user-defined thread method");
		
	}
	public static void main(String[] args) {
		
		Thread th= new Thread(new MyThreadExample());
		th.start();
	}

	

}
