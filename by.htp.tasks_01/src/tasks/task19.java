package tasks;

import java.util.Scanner;

public class task19 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ����� ������� ��������������� ������������:");
		double i=sc.nextDouble();
		System.out.println("������� ������������: "+(Math.pow(i, 2)*Math.sqrt(3))/4);
		System.out.println("������ ������������: "+(i*Math.sqrt(3))/2);
		System.out.println("������ ��������� ����������: "+i/(2*Math.sqrt(3)));
		System.out.println("������ ��������� ����������: "+i/Math.sqrt(3));
		sc.close();
	}
}
