package test1;

import java.util.List;

import DAO1.resultDaoImpl;
import result.entities1.result;

public class testDao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resultDaoImpl pdao=new resultDaoImpl();
		result st=pdao.save1(new result("7","2008","2008"));
		System.out.println(st);
		
		List<result> stss=pdao.resultparMc("k");
		for(result p:stss)
		{
			System.out.println(p);
		} 

	}

}
