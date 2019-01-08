package tasks;

import java.util.Scanner;

public class task09 
{
	public static void main(String[] args) 
	{	
		double z;
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите переменную a:");
		int a =sc.nextInt();
		System.out.println("¬ведите переменную b:");
		int b =sc.nextInt();  
		System.out.println("¬ведите переменную c:");
		int c =sc.nextInt();  
		System.out.println("¬ведите переменную d:");
		int d =sc.nextInt();		
		z = (a/c)*(b/d) - (a*b - c)/c*d;
		System.out.println("–езультат: "+z);
	}
}
