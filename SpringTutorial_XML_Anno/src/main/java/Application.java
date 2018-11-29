import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.personal.mmpandit.service.CustomerService;

/**
 * 
 */

/**
 * @author mmpandit
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// CustomerService = new CustomerServiceImpl();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstName());

	}

}
