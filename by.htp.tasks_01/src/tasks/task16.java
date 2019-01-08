package tasks;

import java.util.Scanner;
import java.io.*;

public class task16 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("Введите четырехзначное число:");
		int i=sc.nextInt();
		int i1 = i/1000;
		int i2 = (i-i1*1000)/100;
		int i3 = (i-i1*1000-i2*100)/10;
		int i4 = i % 10;				
		System.out.println("Произведение всех цифр четырехзначного числа: "+i1*i2*i3*i4);
		
		
	}
}
