package tasks;

import java.util.Scanner;

public class task24 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ����� ��������� a:");
		double a=sc.nextDouble();
		System.out.println("������� ����� ��������� b:");
		double b=sc.nextDouble();
		System.out.println("������� ���� A:");
		double A=sc.nextDouble();
		if (a >b)  
		{			
			double m=(a+b)/2;
			System.out.println("������� �������������� �������� "+m*Math.sqrt(a*b));
			sc.close();
		}
		else
		{
			a=b+1;
			double m=(a+b)/2;
			System.out.println("������� �������������� �������� "+m*Math.sqrt(a*b));
			sc.close();
		}
		sc.close();
	}
}
