package tasks;

import java.util.Scanner;

public class task09 {

	public static void main(String[] args) {
		double sum = 0;
		// TODO Auto-generated method stub
		int start = 1;
		while (start<=100) 
		{
			sum = sum + Math.pow(start, 2);
			
			start = start+1;
		}
		System.out.println(sum);
	}

}
