package tasks;
import java.util.*;

public class task06 {
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.println("������� ����� ����� �������:");
		int a;
		double b,c,z; 
		a= sc.nextInt(); // � ����� �����				        
		c= 80/a;
		b= c+12;
		Scanner sc1= new Scanner(System.in);
		System.out.println("������� ����� ������� �������:");		
		z= sc1.nextInt()*b;
		
		System.out.println("� ������� ������� ���������� - "+z+" ������ ������");
	}
}
