package com.fissionlabs.coe.iq;

public class ThreadClassExample  extends Thread{

	public void run()
	{
		  System.out.println( "this is run method ");
	}
	public static void main(String[] args) {
		
		ThreadClassExample th= new ThreadClassExample();
		th.start();
	}
}
