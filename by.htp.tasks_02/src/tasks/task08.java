package tasks;

import java.util.Scanner;

public class task08 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите значение числа a:");
		double a=sc.nextDouble();
		System.out.println("¬ведите значение числа b:");
		double b=sc.nextDouble();
		if (Math.pow(a, 2) > Math.pow(b, 2)) 
		{
			System.out.println("–езультат=: B меньше A");
		}
		else
		System.out.println("–езультат=: A меньше B");
		sc.close();
	}
}
