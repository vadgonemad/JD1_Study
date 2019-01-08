package by.htp.tasks_07.task01;

public class Test1Inspector {
	public static void main(String[] args) {
		Test1 test1 = new Test1(11,23);
		Test1Logic test1logic = new Test1Logic();
		test1logic.Test1Printer(test1.getX1(), test1.getX2());
		test1logic.Test1Summ(test1.getX1(), test1.getX2());
	}
}
