package by.htp.tasks_07.task03;

import java.util.List;
import java.util.Random;

public class StudentInspector {
	public static void main (String [] args) {
		StudentLogic studentLogic = new StudentLogic();
		studentLogic.addStudents();
		
		System.out.println(studentLogic.printStudents());
	}
	
}
		


