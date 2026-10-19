package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployeebyLoad {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure();
	System.out.println("Loaded");
	SessionFactory sef=conf.buildSessionFactory();
	System.out.println(sef);
	Session ses=sef.openSession();
//	Demo d=ses.load(Demo.class,10);
//	System.out.println(d);
//	Employee e=ses.load(Employee.class,"A");
//	System.out.println(e);
//	Employee e=ses.load(Employee.class,null);
//	System.out.println(e);
	System.out.println("Enter Primary Key=");
	
	Employee e=ses.load(Employee.class,new Scanner(System.in).nextInt());
//	System.out.println(e);
	System.out.println(e.getId());
	System.out.println(e.getName());
}
}
