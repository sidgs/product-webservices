import com.sidgs.product.error.MemberException;
import com.sidgs.product.impl.MemberServiceImpl;
import com.sidgs.product.model.Member;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;
import java.util.Properties;

public class MemberService {

    Log log = LogFactory.getLog(this.getClass());

    DataSource dataSource= null ;

    ApplicationContext ap ;

//    @Before
    public void setup()  {

        log.info("Setting up data source");

        Properties dbcpProperties = new Properties();

        // DriverClass & url
        dbcpProperties.put("driverClassName", "oracle.jdbc.driver.OracleDriver");
        dbcpProperties.put("url", "jdbc:oracle:thin:@" +
                "stp-e-catalog.cfsf6pdw4xmo.us-east-1.rds.amazonaws.com:1521:ORCL");
        // Username / password;
        dbcpProperties.put("username", "aemdev");
        dbcpProperties.put("password", "aemdev");

        try {
            BasicDataSource basicDataSource;
            basicDataSource = new BasicDataSource();
            basicDataSource.setUrl(dbcpProperties.getProperty("url", ""));
            basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            basicDataSource.setUsername("aemdev");
            basicDataSource.setPassword("aemdev");
             dataSource =  basicDataSource;
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
        }

    }

    @Before
    public void springSetup() {
        ap = new ClassPathXmlApplicationContext("classpath:/testApplicationContext.xml");
    }
    @Test
    public void testList() {

        com.sidgs.product.MemberService memberService = (com.sidgs.product.MemberService) ap.getBean("memberServiceImpl");
                //new MemberServiceImpl();
        //((MemberServiceImpl)memberService).setDataSource(dataSource);
        try {
            List<Member> members = memberService.listAll();
            log.info(members.size());
            log.info(members);
            assert(members!=null && !members.isEmpty());
        } catch (MemberException e) {
            assert(false);
        }


    }
   @Test
   public void testAddMember(){
	   Member m1 = new Member();
	   m1.setEmail("kalyanchakri02@gmail.com");
	   m1.setFirstName("kalyan");
	   m1.setLastName("inturi");
	   m1.setTelephone("2036062864");
	   m1.setId(102);
	   m1.setGender("male");
	   m1.setUserid("kinturi102");
       com.sidgs.product.MemberService memberService = new MemberServiceImpl();
          try{
        	  int y=memberService.listAll().size();
        	  log.info(memberService.listAll().size());
        	  memberService.add(m1);
        	  int x = memberService.listAll().size();
        	  log.info(memberService.listAll().size());
              assert(x==(y+1));        	  
          }catch(MemberException e){
        	  assert(false);
          }
	   
	}
}
