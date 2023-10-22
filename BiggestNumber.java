package com.ihub.www;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		if(isBig(a,b))
		{
			System.out.println("a is big");
		}
		else
			System.out.println("b is big");
	}
	public static boolean isBig(int a,int b)
	{
		if(a>b)
			return true;
		else
			return false;
	}

}
