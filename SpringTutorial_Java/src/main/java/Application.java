import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		// CustomerService service = new CustomerServiceImpl();
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
		//System.out.println(service);
		
		//CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		//System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
