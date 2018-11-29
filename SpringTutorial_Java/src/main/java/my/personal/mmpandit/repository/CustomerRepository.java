package my.personal.mmpandit.repository;

import java.util.List;

import my.personal.mmpandit.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}