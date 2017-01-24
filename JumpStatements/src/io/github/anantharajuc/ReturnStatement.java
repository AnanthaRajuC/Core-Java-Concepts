package io.github.anantharajuc;

public class ReturnStatement
{
	public static void main(String[] args)
	{
		ReturnStatement rs = new ReturnStatement();
		System.out.println("Vale returned from method two : " + rs.methodTwo());		
	}
	
	static int methodTwo()
	{
		return 5;
	}
}
