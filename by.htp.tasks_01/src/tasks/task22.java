package tasks;

import java.sql.Date;
import java.util.Scanner;

public class task22 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите натуральное число секунд:");		
		int s=Math.abs(sc.nextInt());
		int m=s/60;
		int h=m/60;
		m=m-h*60;
		s=s - (h*60*60) - (m*60);
		System.out.println(h+"ч"+ m+"мин"+ s+"c");
		sc.close();
	}
}
