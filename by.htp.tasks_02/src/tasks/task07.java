package tasks;

import java.util.Scanner;

public class task07 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� �������� ����� a:");
		double a=sc.nextDouble();
		System.out.println("������� �������� ����� b:");
		double b=sc.nextDouble();
		System.out.println("������� �������� ����� x:");
		double x=sc.nextDouble();
		System.out.println("������� �������� ����� c:");
		double c=sc.nextDouble();		

		System.out.println("���������=: "+Math.abs(a*x*x + b*x + c));
		sc.close();
	}
}
