package by.htp.tasks_07.task03;

import java.util.Arrays;

public class Student {
	String fio;
	int ngr;
	int[] progress = new int[5];
   
    public Student () {
    	
    }
	public Student (String fio,int ngr,int[] progress) {
		this.fio = fio;
		this.ngr = ngr;
		this.progress = progress;
	}
	
	public String getFio() {
		return fio;
	}
	@Override
	public String toString() {
		return "Student [fio=" + fio + ", ngr=" + ngr + ", progress=" + Arrays.toString(progress) + "]";
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getNgr() {
		return ngr;
	}
	public void setNgr(int ngr) {
		this.ngr = ngr;
	}
	public int[] getProgress() {
		return progress;
	}
	public void setProgress(int[] progress) {
		this.progress = progress;
	}
	
}
