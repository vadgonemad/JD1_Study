package tasks;

import java.util.Scanner;

public class task03 
{
	public static void main(String[] args) 
	{	
		String c;
		Scanner sc= new Scanner(System.in);
		System.out.println("������� �������� ����� 1:");
		double a=sc.nextDouble();
		
		if (a<3) 
		{
			c="Yes";
		}
		else {c="No";};
		System.out.println("C=: "+c);
		sc.close();
	}
}
