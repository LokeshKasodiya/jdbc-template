package org.jsp.jdbctemplatedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateEmployeeTable {
	public static void main(String[] args) {
		String qry = "create table Employee(id int not null," + "name varchar(45) not null," + "desg varchar(45) not null,"
				+ "salary decimal(20) not null," + "primary key(id))";

		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.execute(qry);
		System.out.println("Employee table created");

	}
}
