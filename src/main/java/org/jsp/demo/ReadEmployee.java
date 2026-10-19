package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployee {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure();
	System.out.println("Loaded");
	SessionFactory sef=conf.buildSessionFactory();
	System.out.println(sef);
	Session ses=sef.openSession();
//	Demo d=ses.get(Demo.class,10);//UnknownEntityTypeException
//	System.out.println(d);
//	Employee e=ses.get(Employee.class,"A");//TypeMismatchException
//	System.out.println(e);
//	Employee e=ses.get(Employee.class,null);
//	System.out.println(e);
	System.out.println("Enter Primary Key=");
	
	Employee e=ses.get(Employee.class,new Scanner(System.in).nextInt());
	System.out.println(e);
	System.out.println(e.getId());
}
}
