package com.fissionlabs.coe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.fissionlabs.coe.iq.Calculator;

public class JunitTestExample {

	Calculator  cal;
	 @Test
	public void demoTestMethod()
	{
		
		 assertTrue(true);
	}
	
	  @Test
	 public void multiplyTest()
	 {
		 cal = new Calculator();
		 assertEquals(20, cal.multiply(4, 5));
		 assertEquals(25, cal.multiply(5, 5));
		  
	 }
	  
	  @Test
	  public void divideTest()
	  {
		   cal = new Calculator();
		   assertEquals(2, cal.divide(4, 2));
	  }
	  
}
