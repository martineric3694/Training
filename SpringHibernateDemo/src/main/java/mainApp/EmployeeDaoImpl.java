package mainApp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import model.Employees;
import model.Jobs;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory;
	
	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

	public List<Employees> getList(String search, String val) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employees.class);
		if("employeeId".equals(search)){
			criteria.add(Restrictions.eq(search, Integer.parseInt(val)));
		}
		List<Employees> result = criteria.list();
		System.out.println(result.size());
		return result;
	}

	public void insertData(Employees emp, String jobId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Jobs jobs = (Jobs) session.load(Jobs.class, jobId);
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			emp.setJobs(jobs);
			session.save(emp);
			transaction.commit();
		}catch(HibernateException he){
			he.printStackTrace();
			transaction.rollback();
		}finally{
			session.close();
			transaction = null;
		}
	}
}
