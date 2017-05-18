package com.Z.Y;

import org.testng.annotations.Test;

public class MyThread  extends Thread
{
	@Test
	public void Thread()
	{
		for(int i=0; i<=10; i++)
			System.out.println(i);
	}
	@Test
	public void main()
	{
		new Thread().start();
		for(int j=10; j<=20; j++)
		{
			System.out.println(j);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	}
	}

}
