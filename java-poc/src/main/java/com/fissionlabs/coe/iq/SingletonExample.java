package com.fissionlabs.coe.iq;

public class SingletonExample {

	  private static SingletonExample singleton =null;
	  
	  private SingletonExample()
	  {
		  
	  }
	  
	  private static SingletonExample getInstance()
	  {
		   if(singleton==null)
		   {
			    return new SingletonExample();
		   }
		   return singleton;
	  }
}
