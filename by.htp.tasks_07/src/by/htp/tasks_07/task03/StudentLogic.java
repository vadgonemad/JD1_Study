package by.htp.tasks_07.task03;

import java.util.Random;

public class StudentLogic {

private Student[] students = new Student[10];
private String[] discipline = {"Русский язык","Химия","Информатика","Математика","Физика"};

public void addStudents() {
	Random random = new Random();
	String[] familyname = { "Иванов", "Петров", "Федоров", "Антонов", "Денисов", "Русланов", "Родов", "Григоров", "Легов", "Максимов" };
    String[] io = { "А", "П", "О", "В", "Н", "И", "Т", "У", "Ф", "М" };
    	for (int y = 0; y < 10; y++)
    	{
    		students[y] = new Student();
            students[y].setFio(familyname[random.nextInt(9)]+"."+io[random.nextInt(9)]+"."+io[random.nextInt(9)]);
            students[y].setNgr(random.nextInt(9));
            for (int t = 0; t < 5; t++)
            {
                students[y].progress[t] = random.nextInt(11);
            }
        }
    }

public Student[] printStudents() {
	for (int y= 0;y<10;y++) {
		for (int x = 0;x<5;x++) {
			if (students[y].progress[x]==9) {
				System.out.println("ФИО: "+students[y].fio+" №группы: "+students[y].ngr+" Оценка по предмету "+discipline[x]+": "+students[y].progress[x]);
			}else {
				if (students[y].progress[x]==10) {
					System.out.println("ФИО: "+students[y].fio+" №группы: "+students[y].ngr+" Оценка по предмету "+discipline[x]+": "+students[y].progress[x]);
				}
			}
		}

	}
	return students;
}

}

