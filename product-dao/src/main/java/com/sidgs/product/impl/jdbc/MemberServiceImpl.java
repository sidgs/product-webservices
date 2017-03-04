package com.sidgs.product.impl.jdbc;

import com.sidgs.product.MemberService;
import com.sidgs.product.error.MemberException;
import com.sidgs.product.model.Member;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Service


public class MemberServiceImpl implements MemberService {


    Log logger = LogFactory.getLog(this.getClass());

    DataSource dataSource = null ;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void add(Member member) throws MemberException {
            Connection connection= null;
            Statement statement=null;
            try{
            	logger.debug("creating connection");
            	connection=dataSource.getConnection();
            	statement=connection.createStatement();
            	String sql="insert into MEMBER (ID,FIRST_NAME,LAST_NAME,EMAIL,TELE_PHONE,GENDER,USER_ID)"+"VALUES (, '"+ member.getId()+"')"
            			+ "VALUES (, '"+ member.getFirstName()+"')"
            			+ "VALUES (, '"+ member.getLastName()+"')"
            			+ "VALUES (, '"+ member.getLastName()+"')"
            			+ "VALUES (, '"+ member.getEmail()+"')"
            			+ "VALUES (, '"+ member.getGender()+"')"
            					+ "VALUES (, '"+ member.getUserid()+"')";
            											
            	statement.execute(sql);		
            	
            }catch(SQLException e){
            	e.printStackTrace();
                throw new MemberException(e);
            }finally {

                try {
                    statement.close();
                } catch (SQLException e) {
                    logger.debug(e.getMessage(), e);
                }

                try {
                    connection.close();
                } catch (SQLException e) {
                    logger.debug(e.getMessage(), e);
                }
            }
    }

    public void update(Member member) throws MemberException {

        Connection connection = null;
        Statement statement = null;

        try {
            logger.debug("Creating connection");
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            String sql=
                    "update member set  FIRST_NAME = '" + member.getFirstName() + "',  " +
                            "LAST_NAME =  '" + member.getLastName() + "' , " +
                            "EMAIL='" +member.getEmail()+ "', " +
                            "GENDER='" +member.getGender()+ "',  " +
                            "TELE_PHONE='" + member.getTelephone() + "' " +
                            "WHERE ID=" + member.getId()+ "";
            logger.debug("Udpate Statement: " + sql);
            statement.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new MemberException(e);
        } finally {

            try {
                statement.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                connection.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

        }

    }

    public List<Member> listAll() throws MemberException {

        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        List<Member> members = new ArrayList<Member>();

        try {
            logger.debug("Creating connection");
            connection = dataSource.getConnection();

            statement = connection.createStatement();

            String sql = "select * from member";

            logger.info("Running - " + sql);


            result = statement.executeQuery(sql);

            while ( result.next()) {
                Member member = new Member();
                member.setId(result.getLong("ID"));
                member.setFirstName(result.getString("FIRST_NAME"));
                member.setEmail(result.getString("EMAIL"));
                member.setLastName(result.getString("LAST_NAME"));
                member.setTelephone(result.getString("TELE_PHONE"));
                member.setGender(result.getString("GENDER"));
                member.setUserid(result.getString("USERID"));
                members.add(member);
            }


        } catch (Exception e) {
            logger.warn(e.getMessage(),e);
            throw new MemberException(e);
        } finally {

            try {
                result.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                statement.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                connection.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

        }

        return members;
    }

    public List<Member> findbyFirstName(String name) throws MemberException {
    	 Connection connection = null;
         Statement statement = null;
         ResultSet result = null;

         List<Member> members = new ArrayList<Member>();
           try{
        	   logger.debug("Creating connection");
               connection = dataSource.getConnection();

               statement = connection.createStatement();

               String sql = "SELECT * FROM MEMBER WHERE FIRST_NAME = " +name;

               logger.info("Running - " + sql);
               
               result = statement.executeQuery(sql);
               while(result.next()){
            	   Member member = new Member();
                   member.setId(result.getLong("ID"));
                   member.setFirstName(result.getString("FIRST_NAME"));
                   member.setEmail(result.getString("EMAIL"));
                   member.setLastName(result.getString("LAST_NAME"));
                   member.setTelephone(result.getString("TELE_PHONE"));
                   member.setGender(result.getString("GENDER"));
                   member.setUserid(result.getString("USERID"));
                   members.add(member);
               }
        
           }catch (Exception e) {
               logger.warn(e.getMessage(),e);
               throw new MemberException(e);
           } finally {

               try {
                   result.close();
               } catch (SQLException e) {
                   logger.debug(e.getMessage(), e);
               }

               try {
                   statement.close();
               } catch (SQLException e) {
                   logger.debug(e.getMessage(), e);
               }

               try {
                   connection.close();
               } catch (SQLException e) {
                   logger.debug(e.getMessage(), e);
               }}
    	    
        return members;
           }
    

    public Member findByUserID(String userID) throws MemberException {
    	Connection connection = null;
        Statement statement = null;
        ResultSet result = null;
        Member member=null;
        try{
     	   logger.debug("Creating connection");
            connection = dataSource.getConnection();

            statement = connection.createStatement();

            String sql = "SELECT * FROM MEMBER WHERE ID =  '+userID+'";
            result=statement.executeQuery(sql);
            member= new Member();
            member.setId(result.getLong("ID"));
            member.setFirstName(result.getString("FIRST_NAME"));
            member.setEmail(result.getString("EMAIL"));
            member.setLastName(result.getString("LAST_NAME"));
            member.setTelephone(result.getString("TELE_PHONE"));
            member.setGender(result.getString("GENDER"));
        }catch (Exception e) {
            logger.warn(e.getMessage(),e);
            throw new MemberException(e);
        } finally {

            try {
                result.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                statement.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }

            try {
                connection.close();
            } catch (SQLException e) {
                logger.debug(e.getMessage(), e);
            }}
 	    
        return member;
    }
}
