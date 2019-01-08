package tasks;

import java.util.Scanner;

public class task04 
{
	public static void main(String[] args) 
	{	
		String c;
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите значение числа 1:");
		double a=sc.nextDouble();
		System.out.println("¬ведите значение числа 1:");
		double b=sc.nextDouble();
		
		if (a==b) 
		{
			c="Yes";
		}
		else {c="No";};
		System.out.println("C=: "+c);
		sc.close();
	}
}
