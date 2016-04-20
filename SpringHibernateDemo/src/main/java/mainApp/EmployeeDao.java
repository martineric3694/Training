package mainApp;

import java.util.List;

import model.Employees;
import model.Jobs;

public interface EmployeeDao {

	public List<Employees> getList(String search, String val);
	public void insertData(Employees emp, String jobId);
	
}
