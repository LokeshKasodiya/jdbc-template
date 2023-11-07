package org.jsp.jdbctemplatedemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SaveEmployeeWithPlaceholder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id, name, designation and salary to save employee");
		int n=sc.nextInt();
		String name=sc.next();
		String desg=sc.next();
		double sal=sc.nextDouble();
		String qry = "insert into Employee values (?,?,?,? )";
		ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-template.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.update(qry, n, name, desg, sal);
		System.out.println("Record inserted successfully");
	}
}
