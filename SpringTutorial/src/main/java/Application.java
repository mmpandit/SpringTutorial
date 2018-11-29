import my.personal.mmpandit.service.CustomerService;
import my.personal.mmpandit.service.CustomerServiceImpl;

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
		CustomerService service = new CustomerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
