package org.jsp.demo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HQL1 {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		System.out.println("Loaded");
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
		Session ses=sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e where e.id=?1 and e.salary>?2");
		System.out.println("Enter The Id=");
		q.setParameter(1,new Scanner(System.in).nextInt());
		System.out.println("Enter The Salary=");
		q.setParameter(2,new Scanner(System.in).nextDouble());
		try {
			Employee e=q.getSingleResult();
			System.out.println(e);
		}
		catch(NoResultException e) {
			System.err.println("No Record Found");
			
		}
	}

}
