package mainApp;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Employees;
import model.Jobs;


public class Apps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		EmployeeDao empImp = (EmployeeDao) ctx.getBean("employeeDao");
		
		//INSERT DATA
		String jobId = "ST_CLERK";
		Employees emp1 = new Employees();
		emp1.setLastName("Super");
		emp1.setEmail("superking");
		emp1.setHireDate(new Date());	
		
		empImp.insertData(emp1,jobId);
		
		//SELECT DATA
		String search = "";
		String value = "";
		List<Employees> listEmployee = empImp.getList(search, value);
		Iterator<Employees> iter = listEmployee.iterator();
		while(iter.hasNext()){
			Employees emp = iter.next();
			System.out.println(emp.getEmployeeId()+"."+emp.getFirstName()+" "+emp.getLastName());
		}
	}

}
