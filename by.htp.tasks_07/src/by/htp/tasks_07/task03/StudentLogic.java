package by.htp.tasks_07.task03;

import java.util.Random;

public class StudentLogic {

private Student[] students = new Student[10];
private String[] discipline = {"������� ����","�����","�����������","����������","������"};

public void addStudents() {
	Random random = new Random();
	String[] familyname = { "������", "������", "�������", "�������", "�������", "��������", "�����", "��������", "�����", "��������" };
    String[] io = { "�", "�", "�", "�", "�", "�", "�", "�", "�", "�" };
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
				System.out.println("���: "+students[y].fio+" �������: "+students[y].ngr+" ������ �� �������� "+discipline[x]+": "+students[y].progress[x]);
			}else {
				if (students[y].progress[x]==10) {
					System.out.println("���: "+students[y].fio+" �������: "+students[y].ngr+" ������ �� �������� "+discipline[x]+": "+students[y].progress[x]);
				}
			}
		}

	}
	return students;
}

}

