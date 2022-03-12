package DAO1;

import java.util.List;

import result.entities1.result;

public interface resultdao {
	public result save1 (result st);
	public List<result> resultparMc(String mc);
	public result getResult (Long rollnumber);
	public result Updateresult (result st);
	public void Deleteresult(Long rollnumber);
}
