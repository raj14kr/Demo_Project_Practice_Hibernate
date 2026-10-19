package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdate {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure();
	System.out.println("Loaded");
	SessionFactory sef=conf.buildSessionFactory();
	System.out.println(sef);
	Session ses=sef.openSession();
	Transaction tran=ses.getTransaction();
	tran.begin();
	Employee e1=new Employee();
	e1.setId(6);
	e1.setSalary(980000);
	e1.setExp(6.5);
	ses.saveOrUpdate(e1);
	tran.commit();
	
	tran.begin();
	Employee e2=new Employee();
	e2.setId(100);
	e2.setName("Sumit");
	e2.setSalary(125000);
	e2.setExp(4.5);
	ses.saveOrUpdate(e2);
	tran.commit();
}
}
