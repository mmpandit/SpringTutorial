/**
 * 
 */
package my.personal.mmpandit.repository;

import java.util.ArrayList;
import java.util.List;

import my.personal.mmpandit.model.Customer;

/**
 * @author mmpandit
 *
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see my.personal.mmpandit.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Mayur");
		customer.setMiddleName("Milind");
		customer.setLastName("Pandit");

		customers.add(customer);

		return customers;
	}

}
