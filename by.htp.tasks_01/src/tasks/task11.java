package tasks;

import java.util.Scanner;
import java.math.*;
public class task11 
{
	public static void main(String[] args) 
	{	
		double z,y;
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ���������� a:");
		int a =sc.nextInt();
		System.out.println("������� ���������� b:");
		int b =sc.nextInt();  
		double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		z = a+b+c; //��������
		y = a*b/2; //�������
		System.out.println("��������: "+z+", �������: "+y);
	}
}
