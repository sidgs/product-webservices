import com.sidgs.product.error.MemberException;
import com.sidgs.product.impl.MemberServiceImpl;
import com.sidgs.product.model.Member;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.apache.commons.dbcp.DataSourceConnectionFactory;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Before;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class MemberService {

    Log log = LogFactory.getLog(this.getClass());

    DataSource dataSource= null ;

    @Before
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
             dataSource =  BasicDataSourceFactory.createDataSource(dbcpProperties);
        } catch (Exception e) {
            log.warn(e.getMessage(), e);
        }

    }

    @Test
    public void testList() {

        com.sidgs.product.MemberService memberService = new MemberServiceImpl();
        ((MemberServiceImpl)memberService).setDataSource(dataSource);
        try {
            List<Member> members = memberService.listAll();
            assert(members!=null && !members.isEmpty());
        } catch (MemberException e) {
            assert(false);
        }


    }

}
