package tasks;

import java.util.Scanner;

public class task09 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите длину стороны a:");
		double a=sc.nextDouble();
		System.out.println("Введите длину стороны b:");
		double b=sc.nextDouble();
		System.out.println("Введите длину стороны c:");
		double c=sc.nextDouble();
		if (a == b) 
		{
			if (b == c) 
			{
				System.out.println("Треугольник равносторонний");
			}
			System.out.println("Треугольник неравносторонний");
		}
		else
		System.out.println("Треугольник неравносторонний");
		sc.close();
	}
}
