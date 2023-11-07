package org.jsp.jdbctemplatedemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateEmployeeWithPlaceholder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Id, name to update the record");
	int n=sc.nextInt();
	String name=sc.next();
		String qry = "update Employee set name=? where id=?";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.update(qry, name, n);
		System.out.println("Record updated successfully");
	}
}
