/**
 * 
 */
package my.personal.mmpandit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.personal.mmpandit.model.Customer;
import my.personal.mmpandit.repository.CustomerRepository;

/**
 * @author mmpandit
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using Constructor Injection Autowiring");
		this.customerRepository = customerRepository;
		
	}

	/**
	 * @param customerRepository the customerRepository to set
	 */
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using Setter Injection Autowiring");
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

}
