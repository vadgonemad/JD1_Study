package tasks;

import java.util.Scanner;

public class task21 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("¬ведите действительное число в формате nnn.ddd (три цифровых разр€да в дробной и целой част€х):");
		double i1=sc.nextDouble();
		int i2=(int)i1;
		double i3= i1 - i2;
		System.out.println((int)(i3*1000)+"."+i2);
		sc.close();
	}
}
