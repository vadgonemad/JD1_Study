package tasks;

import java.util.Scanner;

public class task06 
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
			c=a;
		}
		else {c=b;};
		System.out.println("����������=: "+c);
		sc.close();
	}
}
