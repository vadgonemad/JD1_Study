package tasks;

import java.util.Scanner;

public class task05 
{
	public static void main(String[] args) 
	{	
		double c;
		Scanner sc= new Scanner(System.in);
		System.out.println("������� �������� ����� 1:");
		double a=sc.nextDouble();
		System.out.println("������� �������� ����� 2:");
		double b=sc.nextDouble();
		
		if (a>b) 
		{
			c=b;
		}
		else {c=a;};
		System.out.println("����������=: "+c);
		sc.close();
	}
}
