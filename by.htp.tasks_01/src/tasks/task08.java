package tasks;

import java.util.Scanner;
import java.math.*;

public class task08 
{
	public static void main(String[] args) 
	{	
		double z;
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ���������� a:");
		int a =sc.nextInt();
		System.out.println("������� ���������� b:");
		int b =sc.nextInt();  
		System.out.println("������� ���������� c:");
		int c =sc.nextInt();  
		z = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c)/2*a) - Math.pow(a, 3)*c + Math.pow(b, -2);
		System.out.println("���������: "+z);
	}
}
