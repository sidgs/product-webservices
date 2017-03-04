import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class ApplicaitonContextTest {


	@Test
	public void test() {
		ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:testApplicationContext.xml");
		//assert(ap.containsBean("/src/main/resources/productDao-ApplicationContext.xml"));
		//System.out.println(Arrays.asList(ap.getBeanDefinitionNames()));
//		String[] array = null;
//		array = ap.getBeanNamesForType(Object.class);
//		for (int i = 0; i < array.length ; i++)
//			System.out.println(array[i]);
		//System.out.println(ap.getBeanNamesForType(Object.class));
	}
	
	
	

}
