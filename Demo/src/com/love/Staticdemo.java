package com.love;

class A
{
	int num1;
	static int num2;
	
}


public class Staticdemo {

	public static void main(String[] args) {
		
		A.num2=5;
		
		A obj1=new A();
		A obj2=new A();
		A obj3=new A();
		
		obj1.num1=3;
		obj2.num1=5;
		obj3.num1=7;
		obj3.num2=10;
		
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		System.out.println(obj3.num1);
		System.out.println(obj1.num2);
		System.out.println(obj2.num2);
		System.out.println(obj3.num2);
		
		
		
	}
}
