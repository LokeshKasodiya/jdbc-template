package org.jsp.jdbctemplatedemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeleteEmployeeByPlaceholder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id to delete record");
		int n = sc.nextInt();
		String qry = "delete from Employee where id=?";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.update(qry, n);
		System.out.println("Record deleted!!!!");
	}
}
