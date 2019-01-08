package tasks;

public class task11 {

	public static void main(String[] args) {
		double sum = 0;
		// TODO Auto-generated method stub
		double start = 1;
		while (start<=199) 
		{
			
			sum = sum - Math.pow(start, 3);
			
			start = start+1;
		}
		System.out.println(sum);
	}

}
