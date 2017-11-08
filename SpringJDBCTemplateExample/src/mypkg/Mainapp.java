package mypkg;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
public class Mainapp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
			dataSource.setDriver(new com.mysql.jdbc.Driver());
			dataSource.setUrl("jdbc:mysql:/localhost/test");
			dataSource.setUsername("dev");
			dataSource.setPassword("password");
			JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
			
			String sqlInsert = "INSERT INTO contact (name, email, address, telephone)"
					+ " VALUES ('one','one@emial.com','India',232323)";
			jdbcTemplate.update(sqlInsert);
			
	}

}
