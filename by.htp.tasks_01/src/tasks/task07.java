package tasks;

import java.util.Scanner;

public class task07 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите ширину прямоугольника:");
		int a =sc.nextInt();
		int b =a*2;  
		int z =a*b;;
		System.out.println("Площадь прямоугольника составляет "+z);
	}
}
