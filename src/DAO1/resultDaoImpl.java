 package DAO1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import result.entities1.result;
import student.connection;

public class resultDaoImpl  implements resultdao{

	@Override
	public result save1  (result e){
		 //List<result> empls=new ArrayList<result>();
		Connection conn=connection.getConnection();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into `studentresult` (`devjee`,`soa`,`devmobile`)values(?,?,?)");
		
			ps.setString(1,e.getDevjee());
			ps.setString(2,e.getSoa());
			//ps.setLong(3,e.getRollnumber());
			ps.setString(3,e.getDevmobile());
			
			ps.executeUpdate();
			System.out.println("Ajout effectuée avec succès");
			
			PreparedStatement ps2= conn.prepareStatement("SELECT MAX(rollnumber) as MAX_rollnumber FROM `studentresult`");
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
public List<result> resultparMc(String mc){
		
	    List<result> sts=new ArrayList<result>();
		Connection conn=connection.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select * FROM `studentresult` where `rollnumber` like ?");
			ps.setString(1,"%"+mc+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				result c=new result();
				c.setRollnumber(rs.getLong("rollnumber"));
				c.setDevjee(rs.getString("devjee"));
				c.setSoa(rs.getString("soa"));
				c.setDevmobile(rs.getString("devmobile"));

				sts.add(c);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sts;
	}
@Override
public result getResult(Long rollnumber) {
	 
	 Connection conn=connection.getConnection();
	 result e = new result();

   try {
   PreparedStatement ps= conn.prepareStatement("select * from `studentresult` where rollnumber = ?");
   ps.setLong(1, rollnumber);
   ResultSet rs = ps.executeQuery();
   if (rs.next()) {	
	   e.setRollnumber(rs.getLong("rollnumber"));
	   e.setDevjee(rs.getString("devjee"));
	   e.setSoa(rs.getString("soa"));
	   e.setDevmobile(rs.getString("devmobile"));

  }
 } catch (SQLException a) {
a.printStackTrace();
}
return e;
}

@Override
public result Updateresult(result st) {
	
		Connection conn=connection.getConnection();
		
	try {
		PreparedStatement ps= conn.prepareStatement("UPDATE `studentresult` SET `rollnumber`=?`,devjee`=?,`soa`=?,`devmobile`=? WHERE `rollnumber`=?");
				ps.setLong(1,st.getRollnumber());
				ps.setString(2,st.getDevjee());
				ps.setString(3,st.getSoa());
				ps.setString(4,st.getDevmobile());
		
				ps.executeUpdate();
				ps.close();
		System.out.println("Modification effectuée avec succès");
		
	}catch (SQLException a) {
		a.printStackTrace();
		}
	return st;
	
}

@Override
public void  Deleteresult(Long rollnumber) {
	
		Connection conn=connection.getConnection();
	
try {
		
		PreparedStatement ps=conn.prepareStatement("DELETE from `studentresult` where rollnumber=?;");
		ps.setLong(1, rollnumber);
		ps.executeUpdate();
		System.out.println("Suppréssion effectuée avec succès");
		ps.close();
		
	
	} catch (SQLException e) {
		e.printStackTrace();
		
		}

	
	
}

}
