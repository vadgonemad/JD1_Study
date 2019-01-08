package tasks;

import java.util.Scanner;

public class task19 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите длину стороны равностороннего треугольника:");
		double i=sc.nextDouble();
		System.out.println("Площадь треугольника: "+(Math.pow(i, 2)*Math.sqrt(3))/4);
		System.out.println("Высота треугольника: "+(i*Math.sqrt(3))/2);
		System.out.println("Радиус вписанной окружности: "+i/(2*Math.sqrt(3)));
		System.out.println("Радиус описанной окружности: "+i/Math.sqrt(3));
		sc.close();
	}
}
