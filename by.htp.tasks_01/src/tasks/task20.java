package tasks;

import java.util.Scanner;

public class task20 
{
		public static void main(String[] args) 
		{	
			Scanner sc= new Scanner(System.in);
			System.out.println("¬ведите длину окружности:");
			double i=sc.nextDouble();
			System.out.println("ѕлощадь круга: "+Math.pow(i, 2)/4*Math.PI);
			sc.close();
		}
}
