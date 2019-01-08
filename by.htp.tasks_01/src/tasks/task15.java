package tasks;

import java.util.Scanner;

public class task15 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		for (int i=1;i <= 4;i++) 
		{
			System.out.println("число Пи в степени: "+i+" равно "+Math.pow(Math.PI, i));
		}
		
	}
}
