/**
 * 
 */
package my.personal.mmpandit.service;

import java.util.List;

import my.personal.mmpandit.model.Customer;
import my.personal.mmpandit.repository.CustomerRepository;
import my.personal.mmpandit.repository.HibernateCustomerRepositoryImpl;

/**
 * @author mmpandit
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see my.personal.mmpandit.service.CustomerService#findALl()
	 */
	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

}
