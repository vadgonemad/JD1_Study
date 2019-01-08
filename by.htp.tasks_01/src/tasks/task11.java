package tasks;

import java.util.Scanner;
import java.math.*;
public class task11 
{
	public static void main(String[] args) 
	{	
		double z,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите переменную a:");
		int a =sc.nextInt();
		System.out.println("¬ведите переменную b:");
		int b =sc.nextInt();  
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		z = a+b+c; //периметр
		y = a*b/2; //площадь
		System.out.println("ѕериметр: "+z+", ѕлощадь: "+y);
	}
}
