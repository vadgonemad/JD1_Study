package tasks;

import java.util.Scanner;

public class task18 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ����� ����� ����:");
		double i=sc.nextDouble();
		System.out.println("������� �����: "+Math.pow(i, 2));
		System.out.println("������� ����: "+Math.pow(i, 2)*6);
		System.out.println("����� ����: "+Math.pow(i,3));
		sc.close();
	}
}
