package tasks;

import java.util.Scanner;

public class task13 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите переменную x1:");
		int x1 =sc.nextInt();
		System.out.println("¬ведите переменную x2:");
		int x2 =sc.nextInt();
		System.out.println("¬ведите переменную y2:");
		int y2 =sc.nextInt();
		System.out.println("¬ведите переменную x3:");
		int x3 =sc.nextInt();
		System.out.println("¬ведите переменную y3:");
		int y3 =sc.nextInt();
		double a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y3-y2,2));
		double b=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		
		double p= a+b+c; //периметр
		double p2=(a+b+c)/2; //полупериметр
		double s= Math.sqrt((p2)*(p2-a)*(p2-b)*(p2-c)); //площадь по √ерону
		

		System.out.println("ѕериметр "+p+"площадь "+s);
	}
}
