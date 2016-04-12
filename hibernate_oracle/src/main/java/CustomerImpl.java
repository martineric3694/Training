import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hrmodel.Employees;
import model.TblContract;
import model.TblCustomer;
import model.TblPhone;

public class CustomerImpl implements Customer{

	private SessionFactory sessionFactory;
	private SessionFactory sessionFactoryHR;
	Session session = null;
	
	public CustomerImpl() {
		// TODO Auto-generated constructor stub
		this.sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		this.sessionFactoryHR = new Configuration().configure("hrschema.cfg.xml").buildSessionFactory();
	}
	
	public List getList() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		
		//Get List Data using Criteria
		List<TblCustomer> result = session.createCriteria(TblCustomer.class).list();
		
		//Get List Data using HQL
//		Query query = session.createQuery("SELECT E.CUSTOMER_ID, E.CUSTOMER_NAME FROM TBL_CUSTOMER AS E");
//		List<TblCustomer> result = query.list();
		
		//Get List Data using ALIAS_TO_ENTITY_MAP
//		SQLQuery query = session.createSQLQuery("SELECT CUSTOMER_ID, CUSTOMER_NAME FROM TBL_CUSTOMER");
//		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		List<TblCustomer> result = query.list();
		
		//Get List Data using Entity
//		SQLQuery query = session.createSQLQuery("SELECT CUSTOMER_ID, CUSTOMER_NAME FROM TBL_CUSTOMER");
//		query.addEntity(TblCustomer.class);
//		List<TblCustomer> result = query.list();
		return result;
	}

	public void insertData(TblCustomer cust) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(cust);
			tx.commit();
		} catch (HibernateException a) {
			a.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
			tx = null;
		}
	}

	public void deleteData(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		
		System.out.println(id);
		//Menggunakan Persistent untuk melakukan delete data
		TblCustomer customer = new TblCustomer();
		customer.setCustomerId(new BigDecimal(id));
				
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			tx.begin();
			session.delete(customer);
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			tx = null;
		}
		
		//Menggunakan Query untuk melakukan hapus data
//		Query query = session.createQuery("DELETE tbl_customer where customer_id = :ID");
//		query.setParameter("ID", id);
//		
//		Transaction tx = null;
//		try{
//			tx = session.beginTransaction();
//			tx.begin();
//			query.executeUpdate();
//			tx.commit();
//		}catch(HibernateException ex){
//			ex.printStackTrace();
//			tx.rollback();
//		}catch (Exception e) {
//			e.printStackTrace();
//			tx.rollback();
//		}finally{
//			session.close();
//			tx = null;
//		}
		
	}

	public void updateData(TblCustomer cust) {
		// TODO Auto-generated method stub
		TblCustomer content = cust;
		session = sessionFactory.openSession();
		
		//System.out.println(content.getCustomerId()+" "+content.getCustomerName());
		
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			tx.begin();
			session.update(content);
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			tx = null;
		}
	}
	
	public void updateDataLoad(TblCustomer cust) {
		// TODO Auto-generated method stub
		session = sessionFactory.openSession();
		
		//System.out.println(content.getCustomerId()+" "+content.getCustomerName());
		Object obj = session.load(TblCustomer.class, cust.getCustomerId());
		TblCustomer tblCust = (TblCustomer)obj;
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			tx.begin();
			tblCust.setCustomerName(cust.getCustomerName());
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
			tx = null;
		}
	}
	
	public List<Employees> getListEmployees(){
		Session session = sessionFactoryHR.openSession();
		
		List<Employees> result = session.createCriteria(Employees.class).list();
		return result;
	}
	
	public void insertForiegnTable(TblContract cont){
		TblContract contractContent = cont;
		TblCustomer customerContent = cont.getTblCustomer();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			tx.begin();
			session.save(customerContent);
			customerContent.getTblContracts().add(contractContent);
			session.save(contractContent);
			tx.commit();
		}catch(HibernateException ex){
			ex.printStackTrace();
			tx.rollback();
		}finally{
			tx = null;
			session.close();
		}
	}

}
