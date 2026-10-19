package org.jsp.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOr {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure();
	System.out.println("Loaded");
	SessionFactory sef=conf.buildSessionFactory();
	System.out.println(sef);
	Session ses=sef.openSession();
	Transaction tran=ses.getTransaction();
	tran.begin();
	System.out.println("Enter Primary key=");
	Employee e=ses.get(Employee.class,new Scanner(System.in).nextInt());
	if(e!=null) {
		ses.delete(e);
		tran.commit();
	}
	else
	{
		System.out.println("No Record DeletedSince Id is found");
	}
}
}
