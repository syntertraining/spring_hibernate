package com.mypkg.SpringJdbcTemplateDemo;

/**
 * Hello world!
 *
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class App 
{
    public static void main( String[] args )
    {
    	SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
    	try {
			dataSource.setDriver(new com.mysql.jdbc.Driver());
			dataSource.setUrl("jdbc:mysql://localhost/test");
			dataSource.setUsername("dev");
			dataSource.setPassword("password");
			JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
			/*
			String sqlInsert="INSERT INTO contact(name,email,address,telephone)"+" VALUES(?,?,?,?)";
			jdbcTemplate.update(sqlInsert,"emp01","emp01@gmail.com","India","12345");
			String sqlUpdate="update contact set email=? where name=?";
			jdbcTemplate.update(sqlUpdate,"empoyeee01@xyz.com","emp01");
			
			String sqlSelect="select * from contact";
			List<Contact> listContact=jdbcTemplate.query(sqlSelect, new RowMapper<Contact>(){
				public Contact mapRow(ResultSet result,int rowNum) throws SQLException{
					Contact contact=new Contact();
					contact.setName(result.getString("name"));
					contact.setEmail(result.getString("email"));
					contact.setAddress(result.getString("address"));
					contact.setPhone(result.getString("telephone"));
					return contact;
				}
			});
			for (Contact aContact: listContact){
				System.out.println(aContact);
			}
			*/
			String sqlDelete="DELETE from contact where name=?";
			jdbcTemplate.update(sqlDelete,"emp01");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
