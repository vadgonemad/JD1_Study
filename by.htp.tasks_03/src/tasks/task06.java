package tasks;

import java.util.Scanner;

public class task06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("¬ведите число");
		int sum,i,start;
		start = 1;
		sum = 0;
		i = sc.nextInt();
		while (start<=i) 
		{
			sum = sum+start;
			
			start = start+1;
		}
		System.out.println(sum);
	}
}
