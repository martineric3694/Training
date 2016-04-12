import java.util.List;

import model.TblCustomer;

public interface Customer {

	public List getList();
	public void insertData(TblCustomer cust);
	public void deleteData(String id);
	public void updateData(TblCustomer cust);
}
