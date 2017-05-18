package com.Z.Y;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Pallindrome 
{
	@Test
	public void Pallindrome()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scn.next();
		for(int i=s1.length()-1; i>=0; i--)
		{
			char c=s1.charAt(i);
		
			if(s1.equals(c))
			{
				System.out.println(c + "is pallindrome");
			}
			else
			{
				System.out.println(" is not pallindrome");
			}
		}
	}

}
