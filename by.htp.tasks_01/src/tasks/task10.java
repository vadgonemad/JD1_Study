package tasks;

import java.util.Scanner;

public class task10 
{
	public static void main(String[] args) 
	{	
		double z;
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите переменную x:");
		int x =sc.nextInt();
		System.out.println("¬ведите переменную y:");
		int y =sc.nextInt();  
		z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)) * Math.tanh(x*y);
		System.out.println("–езультат: "+z);
	}
}
