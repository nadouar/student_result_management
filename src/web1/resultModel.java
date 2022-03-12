package web1;

import java.util.ArrayList;
import java.util.List;

import result.entities1.result;

public class resultModel {
	private String motCle1;
	List<result> results = new ArrayList<>();
	public String getMotCle1() {
		return motCle1;
	}
	public void setMotCle1(String motCle1) {
		this.motCle1 = motCle1;
	}
	public List<result> getResults() {
		return results;
	}
	public void setResults(List<result> results) {
		this.results = results;
	}
	
	
}
