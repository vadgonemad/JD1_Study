package tasks;

import java.util.Scanner;

public class task24 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите длину основания a:");
		double a=sc.nextDouble();
		System.out.println("Введите длину основания b:");
		double b=sc.nextDouble();
		System.out.println("Введите угол A:");
		double A=sc.nextDouble();
		if (a >b)  
		{			
			double m=(a+b)/2;
			System.out.println("Площадь равнобедренной трапеции "+m*Math.sqrt(a*b));
			sc.close();
		}
		else
		{
			a=b+1;
			double m=(a+b)/2;
			System.out.println("Площадь равнобедренной трапеции "+m*Math.sqrt(a*b));
			sc.close();
		}
		sc.close();
	}
}
