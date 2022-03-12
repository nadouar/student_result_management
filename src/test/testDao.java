package test;

import java.util.List;
import DAO.studentDaoImpl;
import student.entities.student;

public class testDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentDaoImpl pdao=new studentDaoImpl();
		student st=pdao.save(new student("p","p","p","p","p"));
		System.out.println(st);
		
		List<student> stss=pdao.studentparMc("hp");
		for(student p:stss)
		{
			System.out.println(p);
		} 

	}

}
