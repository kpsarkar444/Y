package com.Z.Y;

import org.testng.annotations.Test;

public class Array 
{
	@Test
	public void Array()
	{
	 int[] a = {1,2,2,3,4,4,5,5,6,7};
	 int big=1;
	 for(int i=0; i<a.length; i++)
	 {
	if(a[i]>big && a[i]==big)
	{
		big=a[i];
		
	}
	
	 System.out.println(big);
	}
	 
	




	}





}
