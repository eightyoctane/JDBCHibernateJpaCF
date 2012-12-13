package com.mkyong.customer.management;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mkyong.customer.Customer;

public class HibernateCustomerRepository implements CustomerRepository {
	
	private SessionFactory sessionFactory;

	/**
	 * Creates an new hibernate-based account repository.
	 * @param sessionFactory the Hibernate session factory required to obtain sessions
	 */
	public HibernateCustomerRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Returns the session associated with the ongoing reward transaction.
	 * @return the transactional session
	 */
	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}	
		
	
	public Customer findCustomerByName(String name) {
		Integer customersId = (Integer) getCurrentSession().createSQLQuery(
				"select NAME from G_CUSTOMER where NAME = ?").setString(0, name)
				.uniqueResult();
		return (Customer) getCurrentSession().load(Customer.class, customersId.longValue());
	}

	

	public boolean installCustomer(String name, String address, String state, String phone) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean removeCustomer() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

}
