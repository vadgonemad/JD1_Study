package by.htp.tasks_07.task01;

public class Test1Logic {
	public static void Test1Printer (int x1,int x2) {
		if (x1 > x2) {
			System.out.println("Наибольшее значение x1 "+x1);
		} else {
			System.out.println("Наибольшее значение x2 "+x2);
		}
	}
	public static void Test1Summ (int x1,int x2) {
		int x3;
		x3 = x1 + x2;
		System.out.println("Сумма значений x1 x2 составляет "+x3);
	}
}
