package web;

import java.util.ArrayList;
import java.util.List;

import student.entities.student;

public class studentModel {

	private String motCle;
	List<student> students = new ArrayList<>();
	
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<student> getStudents() {
		return students;
	}
	public void setStudents(List<student> students) {
		this.students = students;
	}
	
	
	
}
