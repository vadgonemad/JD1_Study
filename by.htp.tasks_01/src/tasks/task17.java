package tasks;

import java.util.Scanner;

public class task17 
{
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ������ �����:");
		int i1=sc.nextInt();
		System.out.println("������� ������ ����� �����:");
		int i2=sc.nextInt();
		double arI=(Math.pow(i1, 3)+Math.pow(i2, 3))/2;
		double geomI=Math.sqrt(Math.abs(i1)*Math.abs(i2));
		System.out.println("�������������������� ����� 2 �����: "+arI);
		System.out.println("�������������������� ������� 2 �����: "+geomI);
		
	}

}
