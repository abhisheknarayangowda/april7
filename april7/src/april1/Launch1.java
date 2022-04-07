package april1;

import java.util.Scanner;

interface Mycalculator
{
	void add();
	void mul();
}
class Calculator1 implements Mycalculator
{
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
}
class Calculator2 implements Mycalculator
{
	public void add()
	{
Scanner scan = new Scanner(System.in);
System.out.println("enter the 1st num");
int a=scan.nextInt();
System.out.println("enter the 2nd num");
int b=scan.nextInt();
int c = a+b;
System.out.println(c);
	}
	public void mul()
	{
Scanner scan = new Scanner(System.in);
System.out.println("enter the 1st num");
int a=scan.nextInt();
System.out.println("enter the 2nd num");
int b=scan.nextInt();
int c = a*b;
System.out.println(c);
	}
}



public class Launch1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator1 c1=new Calculator1();
c1.add();
c1.mul();
Calculator2 c2=new Calculator2();
c2.add();
c2.mul();
	
	}}

	
	
	
	

