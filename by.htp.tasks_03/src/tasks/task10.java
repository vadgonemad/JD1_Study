package tasks;

public class task10 {

	public static void main(String[] args) {
		double sum = 1;
		// TODO Auto-generated method stub
		double start = 1;
		while (start<=199) 
		{
			
			sum = sum * Math.pow(start, 2);
			
			start = start+1;
		}
		System.out.println(sum);
	}

}
