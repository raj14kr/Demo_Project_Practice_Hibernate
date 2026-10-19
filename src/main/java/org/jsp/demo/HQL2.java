package org.jsp.demo;


import java.util.List;
import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HQL2 {
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		System.out.println("Loaded");
		SessionFactory sef=conf.buildSessionFactory();
		System.out.println(sef);
		Session ses=sef.openSession();
		Query<Employee> q=ses.createQuery("select e from Employee e where e.name=?1");
		System.out.println("Enter The  Name=");
		q.setParameter(1,new Scanner(System.in).nextLine());
		
		List<Employee> el=q.getResultList();
		if(el.size()>0) {
			for(Employee e:el) {
				System.out.println(e);
			}
		}
		else
		{
			System.err.println("No Record Found");
		}
		
		
	}

}
