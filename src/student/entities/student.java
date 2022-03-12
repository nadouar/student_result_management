package student.entities;

public class student {

	
	private String coursename,branchename,firstname,lastname,gender;
	private Long rollnumber;

	

	public student() {
		super();
	}

	public student( String coursename, String branchename, String firstname, String lastname, String gender) {
		super();
		this.coursename = coursename;
		this.branchename = branchename;
		//this.rollnumber = rollnumber;
		this.firstname = firstname; 
		this.lastname = lastname;
		this.gender = gender;
		
	}
	
	public String getCoursename() {
		return coursename;
	}
	
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	public String getBranchename() {
		return branchename;
	}
	
	public void setBranchename(String branchename) {
		this.branchename = branchename;
	}
	
	public Long getRollnumber() {
		return rollnumber;
	}
	
	public void setRollnumber(Long rollnumber) {
		this.rollnumber = rollnumber;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
@Override
	public String toString() {
		return "student [coursename=" + coursename + ", branchename=" + branchename + ", rollnumber=" + rollnumber + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", gender=" + gender + "]";
	}
	



}
