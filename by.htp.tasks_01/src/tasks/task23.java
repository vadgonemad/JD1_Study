package tasks;

import java.util.Scanner;

public class task23 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите внутренний радиус кольца:");		
		double r=Math.abs(sc.nextDouble());
		System.out.println("Введите внешний радиус кольца:");
		double R=Math.abs(sc.nextDouble());
		if (R > r)  
		{
			
			double sR=Math.PI*Math.pow(R, 2);
			System.out.println("Площадь внешнего круга "+sR);
			double sr=Math.PI*Math.pow(r, 2);
			System.out.println("Площадь внутреннего круга "+sr);
			System.out.println("Площадь кольца "+(sR-sr));
			sc.close();
		}
		else
		{
			R=r+1;
			double sR=Math.PI*Math.pow(R, 2);
			System.out.println("Площадь внешнего круга "+sR);
			double sr=Math.PI*Math.pow(r, 2);
			System.out.println("Площадь внутреннего круга "+sr);		
			System.out.println("Площадь кольца "+(sR-sr));
			sc.close();
		}
		
	}
}
