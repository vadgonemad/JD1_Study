package tasks;

import java.util.Scanner;

public class task08 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� �������� ����� a:");
		double a=sc.nextDouble();
		System.out.println("������� �������� ����� b:");
		double b=sc.nextDouble();
		if (Math.pow(a, 2) > Math.pow(b, 2)) 
		{
			System.out.println("���������=: B ������ A");
		}
		else
		System.out.println("���������=: A ������ B");
		sc.close();
	}
}
