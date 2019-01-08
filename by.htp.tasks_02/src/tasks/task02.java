package tasks;

import java.util.Scanner;

public class task02 
{
	public static void main(String[] args) 
	{	
		String c;
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите значение числа 1:");
		double i1=sc.nextDouble();
		
		System.out.println("¬ведите значение числа 2:");
		double i2=sc.nextDouble();
		if (i1<i2) 
		{
			c="Yes";
		}
		else {c="No";};
		System.out.println("C=: "+c);
		sc.close();
	}
}
