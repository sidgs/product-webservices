import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:member-jdbc.properties")

public class SpringConfigForUnitTesting {

    @Value("${jdbc.classname}")
    String driverClassName = "";

    @Value("${jdbc.driverUrl}")
    String driverUrl = "" ;

    @Value("${jdbc.username}")
    String username = "";

    @Value("${jdbc.password}")
    String password = "" ;

    @Bean
    @Scope (value = "singleton")
    public DataSource getDataSource(){

        driverClassName = System.getProperty("jdbc.classname", "oracle.jdbc.driver.OracleDriver");
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(driverClassName);
        basicDataSource.setUrl(driverUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
        return  basicDataSource;
    }


}
