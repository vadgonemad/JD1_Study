package tasks;

import java.util.Scanner;

public class task13 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ���������� x1:");
		int x1 =sc.nextInt();
		System.out.println("������� ���������� x2:");
		int x2 =sc.nextInt();
		System.out.println("������� ���������� y2:");
		int y2 =sc.nextInt();
		System.out.println("������� ���������� x3:");
		int x3 =sc.nextInt();
		System.out.println("������� ���������� y3:");
		int y3 =sc.nextInt();
		double a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y3-y2,2));
		double b=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		
		double p= a+b+c; //��������
		double p2=(a+b+c)/2; //������������
		double s= Math.sqrt((p2)*(p2-a)*(p2-b)*(p2-c)); //������� �� ������
		

		System.out.println("�������� "+p+"������� "+s);
	}
}
