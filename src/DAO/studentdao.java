package DAO;

import java.util.List;
import student.entities.student;

public interface studentdao {
	public student save (student st);
	public List<student> studentparMc(String mc);
	public student getStudent (Long rollnumber);
	public student UpdateStudent (student st);
	public void DeleteStudent(Long rollnumber);
}
