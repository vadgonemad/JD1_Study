package tasks;

import java.util.Scanner;

public class task14 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите радиус r:");
		double r=sc.nextDouble();
		double p=2*Math.PI*r;
		double s=Math.PI*Math.pow(r, 2);

		System.out.println("Длина: "+p+", Площадь: "+s);
	}
}
