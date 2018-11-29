import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import my.personal.mmpandit.repository.CustomerRepository;
import my.personal.mmpandit.repository.HibernateCustomerRepositoryImpl;
import my.personal.mmpandit.service.CustomerService;
import my.personal.mmpandit.service.CustomerServiceImpl;

/**
 * 
 */

/**
 * @author mmpandit
 *
 */
@Configuration
@ComponentScan({"my.personal.mmpandit"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		//CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}*/

	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/

}
