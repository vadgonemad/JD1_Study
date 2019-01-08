package tasks;

import java.util.Scanner;

public class task07 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите значение числа a:");
		double a=sc.nextDouble();
		System.out.println("¬ведите значение числа b:");
		double b=sc.nextDouble();
		System.out.println("¬ведите значение числа x:");
		double x=sc.nextDouble();
		System.out.println("¬ведите значение числа c:");
		double c=sc.nextDouble();		

		System.out.println("–езультат=: "+Math.abs(a*x*x + b*x + c));
		sc.close();
	}
}
