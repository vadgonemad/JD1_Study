package tasks;

import java.util.Scanner;

public class task09 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ����� ������� a:");
		double a=sc.nextDouble();
		System.out.println("������� ����� ������� b:");
		double b=sc.nextDouble();
		System.out.println("������� ����� ������� c:");
		double c=sc.nextDouble();
		if (a == b) 
		{
			if (b == c) 
			{
				System.out.println("����������� ��������������");
			}
			System.out.println("����������� ����������������");
		}
		else
		System.out.println("����������� ����������������");
		sc.close();
	}
}
