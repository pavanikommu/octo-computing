package com.milan.processing;

public class ThreadEx extends Thread 
{
	String name;
	public ThreadEx(String name)
	{
		this.name =  name;
		
	}
	
	
	public void run()
	{
		if(this.name.equalsIgnoreCase("www.priceline.com"))
			displayMethod();
		if(this.name.equalsIgnoreCase("www.vayama.com")){
			deopistMethod();
			
			
		}
		
		if(this.name.equalsIgnoreCase("www.kayak.com"))
		someMethod();	
		
	}
	
	
	private void someMethod() 
	{

		
	}


	private void deopistMethod() 
	{
		System.out.println("THREAD STATRTED"+this.name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THREAD ENDED"+this.name);
		
		
		if(this.name.equalsIgnoreCase("www.vayama.com"))
			displayMethod();
	}
	
	
	public void displayMethod() 
	{
		System.out.println("THREAD STATRTED"+this.name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THREAD ENDED"+this.name);
	}


	public static void main(String s[])
	{
		System.out.println("MAIN METHOD STARTED");
		
		ThreadEx thread1 = new ThreadEx("www.priceline.com");
		thread1.start();
		
		ThreadEx thread2 = new ThreadEx("www.kayak.com");
		thread2.start();

		
		ThreadEx thread3 = new ThreadEx("www.vayama.com");
		thread3.start();
		
		System.out.println("MAIN METHOD ENDED");
	}

}
