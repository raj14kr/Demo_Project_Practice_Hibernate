package org.jsp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TESTCFG {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		System.out.println("Loaded");
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
		Session ses=sef.openSession();
		Transaction tran=ses.getTransaction();
//		tran.begin();
//		Employee e=new Employee();
//		e.setName("A");
//		e.setSalary(65000.0);
//		e.setExp(1.4);
//		ses.save(e);
		
//		tran.begin();
//		Employee e1=new Employee();
//		e1.setName("B");
//		e1.setSalary(55000.0);
//		e1.setExp(1.2);
//		ses.save(e1);
//		tran.commit();
//		
//		tran.begin();
//		Employee e2=new Employee();
//		e2.setName("C");
//		e2.setSalary(45000.0);
//		e2.setExp(2.4);
//		ses.save(e2);
//		tran.commit();
		
		tran.begin();
		Employee e1=new Employee();
		e1.setName("D");
		e1.setSalary(58000.0);
		e1.setExp(2.2);
		ses.save(e1);
		
		Employee e2=new Employee();
		e2.setName("E");
		e2.setSalary(88000.0);
		e2.setExp(0.4);
		ses.save(e2);
		tran.commit();
		
		}

}
