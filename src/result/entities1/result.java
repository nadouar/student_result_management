package result.entities1;

public class result {

	
	private String devjee,soa,devmobile;
	private Long rollnumber;

	

	public result() {
		super();
	}

	public result( String devjee, String soa, String devmobile) {
		super();
		this.devjee = devjee;
		this.soa = soa;
		//this.rollnumber = rollnumber;
		this.devmobile = devmobile; 
	}

	public String getDevjee() {
		return devjee;
	}

	public void setDevjee(String devjee) {
		this.devjee = devjee;
	}

	public String getSoa() {
		return soa;
	}

	public void setSoa(String soa) {
		this.soa = soa;
	}

	public String getDevmobile() {
		return devmobile;
	}

	public void setDevmobile(String devmobile) {
		this.devmobile = devmobile;
	}

	public Long getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(Long rollnumber) {
		this.rollnumber = rollnumber;
	}

	@Override
	public String toString() {
		return "result [devjee=" + devjee + ", soa=" + soa + ", devmobile=" + devmobile + ", rollnumber=" + rollnumber
				+ "]";
	}
	
	
}
