/**
 * 
 */
package my.personal.mmpandit.service;

import java.util.List;

import my.personal.mmpandit.model.Customer;
import my.personal.mmpandit.repository.CustomerRepository;

/**
 * @author mmpandit
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see my.personal.mmpandit.service.CustomerService#findALl()
	 */
	@Override
	public List<Customer> findAll() {

		return customerRepository.findAll();
	}

	/**
	 * @param customerRepository the customerRepository to set
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

}
