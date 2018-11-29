/**
 * 
 */
package my.personal.mmpandit.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import my.personal.mmpandit.model.Customer;

/**
 * @author mmpandit
 *
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;

	/*
	 * (non-Javadoc)
	 * 
	 * @see my.personal.mmpandit.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Mayur");
		customer.setMiddleName("Milind");
		customer.setLastName("Pandit");

		customers.add(customer);

		return customers;
	}

}
