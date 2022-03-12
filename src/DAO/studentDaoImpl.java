package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student.connection;
import student.entities.student;

public class studentDaoImpl implements studentdao{
	@Override
	public student save(student e){
		// List<student> empls=new ArrayList<student>();
		Connection conn=connection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into `student` (`coursename`,`branchename`,`firstname`,`lastname`,`gender`)values(?,?,?,?,?)");
		
			ps.setString(1,e.getCoursename());
			ps.setString(2,e.getBranchename());
			//ps.setLong(3,e.getRollnumber());
			ps.setString(3,e.getFirstname());
			ps.setString(4,e.getLastname());
			ps.setString(5,e.getGender());
			ps.executeUpdate();
			System.out.println("Ajout effectuée avec succès");
			
			PreparedStatement ps2= conn.prepareStatement("SELECT MAX(rollnumber) as MAX_rollnumber FROM `student`");
					ResultSet rs =ps2.executeQuery();
					if (rs.next()) {
					e.setRollnumber(rs.getLong("MAX_rollnumber"));
					}
					ps.close();
					ps2.close();

			
	}catch(SQLException a) {
		a.printStackTrace();
		}
		
		return e;
	}
	
	
	@Override
public List<student> studentparMc(String mc){
		
	    List<student> sts=new ArrayList<student>();
		Connection conn=connection.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * FROM `student` where `rollnumber` like ?");
			ps.setString(1,"%"+mc+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				student c=new student();
				
				c.setCoursename(rs.getString("coursename"));
				c.setBranchename(rs.getString("branchename"));
				c.setRollnumber(rs.getLong("rollnumber"));
				c.setFirstname(rs.getString("firstname"));
				c.setLastname(rs.getString("lastname"));
				c.setGender(rs.getString("gender"));
				
				sts.add(c);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sts;
	}
@Override
public student getStudent(Long rollnumber) {
	 
	 Connection conn=connection.getConnection();
	 student e = new student();

   try {
   PreparedStatement ps= conn.prepareStatement("select * from `student` where rollnumber = ?");
   ps.setLong(1, rollnumber);
   ResultSet rs = ps.executeQuery();
   if (rs.next()) {
	   e.setCoursename(rs.getString("coursename"));
		e.setBranchename(rs.getString("branchename"));
		e.setRollnumber(rs.getLong("rollnumber"));
		e.setFirstname(rs.getString("firstname"));
		e.setLastname(rs.getString("lastname"));
		e.setGender(rs.getString("gender"));
  }
 } catch (SQLException a) {
a.printStackTrace();
}
return e;
}

@Override
public student UpdateStudent(student st) {
	
		Connection conn=connection.getConnection();
		
	try {
		PreparedStatement ps= conn.prepareStatement("UPDATE `student` SET `coursename`=?,`branchename`=?,`firstname`=?,`lastname`=?,`gender`=? WHERE `rollnumber`=?");
		
		ps.setString(1,st.getCoursename());
		ps.setString(2,st.getBranchename());
		ps.setString(3,st.getFirstname());
		ps.setString(4,st.getLastname());
		ps.setString(5,st.getGender());
		ps.setLong(6,st.getRollnumber());

		ps.executeUpdate();
		ps.close();
		System.out.println("Modification effectuée avec succès");
		
	}catch (SQLException a) {
		a.printStackTrace();
		}
	return st;
	
}

@Override
public void  DeleteStudent(Long rollnumber) {
	
		Connection conn=connection.getConnection();
	
try {
		
		PreparedStatement ps=conn.prepareStatement("DELETE from `student` where rollnumber=?;");;
		ps.setLong(1, rollnumber);
		ps.executeUpdate();
		System.out.println("Suppréssion effectuée avec succès");
		ps.close();
		
	
	} catch (SQLException e) {
		e.printStackTrace();
		
		}

	
	
}

}
