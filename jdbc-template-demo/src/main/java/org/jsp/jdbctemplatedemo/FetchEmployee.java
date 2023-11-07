package org.jsp.jdbctemplatedemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FetchEmployee {
public static void main(String[] args) {
	String qry="select * from employee";
	ApplicationContext context=new ClassPathXmlApplicationContext("jdbc-template.xml");
	JdbcTemplate template=context.getBean(JdbcTemplate.class);
	String message =template.query(qry,new ResultSetExtractorImpl());
}
}

class ResultSetExtractorImpl implements ResultSetExtractor<String>{

	public String extractData(ResultSet rs) throws SQLException, DataAccessException {
		while(rs.next()) {
			System.out.println("Id :"+rs.getInt(1));
			System.out.println("Name :"+rs.getString(2));
			System.out.println("Designation :"+rs.getString(3));
			System.out.println("Salary :"+rs.getDouble(4));
		}
		return "data has been printed";
	}
	
}