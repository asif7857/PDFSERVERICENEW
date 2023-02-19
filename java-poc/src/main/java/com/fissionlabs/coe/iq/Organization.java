package com.fissionlabs.coe.iq;


public class Organization {

	 String orgName;
	 String orgLocation;
	 
	 Organization(Organization org)
	 {
		 this.orgName = org.orgName;
		 this.orgLocation= org.orgLocation;
	 }
	 final int number = 100;
	
	 public static void show()
	 {
		 System.out.println("this is static show method");
	 }
	 public static void show(int a)
	 {
		   System.out.println("static method with some parameter");
	 }
	 
}
