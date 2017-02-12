import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ApplicaitonContextTest {

	@Test
	public void test() {
		ApplicationContext ap = new ClassPathXmlApplicationContext();
		assert(ap.containsBean("/src/main/resources/productDao-ApplicationContext.xml"));
	}
	
	
	

}
