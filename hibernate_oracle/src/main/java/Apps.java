import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hrmodel.Employees;
import model.TblContract;
import model.TblCustomer;
import model.TblPhone;


public class Apps {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("generate table");
		
		CustomerImpl cImpl = new CustomerImpl();

		
		/*	INSERT DATA	*/
//		TblCustomer cust1 = new TblCustomer();
//		BigDecimal custId = new BigDecimal(101);
//		cust1.setCustomerId(custId);
//		cust1.setCustomerName("Kui");
//		
//		TblCustomer cust2 = new TblCustomer();
//		BigDecimal custI2 = new BigDecimal(102);
//		cust2.setCustomerId(custI2);
//		cust2.setCustomerName("Kuki");
//		
//		cImpl.insertData(cust1);
//		cImpl.insertData(cust2);
		
		//Insert to One-Many Table
//		TblCustomer cust1 = new TblCustomer();
//		cust1.setCustomerId(new BigDecimal(100));
//		cust1.setCustomerName("Susi");
//		
//		TblContract contCust1 = new TblContract();
//		contCust1.setContractId(new BigDecimal(1));
//		contCust1.setContractNo("12468");
//		contCust1.setTblCustomer(cust1);
//		
//		cImpl.insertForiegnTable(contCust1);
//		
		
		/*	DELETE DATA	*/
//		String id = "104";
//		cImpl.deleteData(id);
		
		
		/*	UPDATE DATA	*/
//		System.out.println(cust.getCustomerId()+" "+cust.getCustomerName());
		
//		cust1.setCustomerId(new BigDecimal(104));
//		cust1.setCustomerName("Polo");
		
		//Using update syntax
//		cImpl.updateData(cust1);
		
		//Using load syntax
//		cImpl.updateDataLoad(cust1);
		
		
		
		/*	LIST DATA	*/
		
		//Mapping to HashMap
//		List<Object> list = cImpl.getList();
//		for(Object cust : list){
//			Map row = (Map)cust;
//			System.out.println(row.get("CUSTOMER_ID")+" "+row.get("CUSTOMER_NAME"));
//		}
		
		//Mapping to TblCustomer
//		List<TblCustomer> list = cImpl.getList();
//		Iterator<TblCustomer> iter = list.iterator();
//		while(iter.hasNext()){
//			cust1 = iter.next();
//			System.out.println(cust1.getCustomerId()+" "+cust1.getCustomerName());
//		}
		
		
		System.out.println("Get Data From HR Schema");
		//Other Schema HR
//		List<Employees> listEmp = cImpl.getListEmployees();
//		Iterator<Employees> iterEmp = listEmp.iterator();
//		Employees emp = new Employees();
//		while(iterEmp.hasNext()){
//			emp = iterEmp.next();
//			System.out.println(emp.getEmployeeId()+" "+emp.getFirstName());
//		}
	
	}

}
