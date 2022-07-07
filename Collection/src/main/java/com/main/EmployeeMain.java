package com.main;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee(10,"panni pandaaram",'M',25000f);
		Employee employee2 = new Employee(20,"Poona mani",'M',3500f);
		Employee employee3 = new Employee(30,"Saara paambu",'M',4500f);
		Employee employee4 = new Employee(40,"Maatu ravi",'M',5500f);
		List set = new ArrayList();
		System.out.println("Set size : " + set.size());
		set.add(employee1);
		set.add(employee2);
		set.add(employee3);
		set.add(employee4);
		System.out.println("Set size : " + set.size());
		set.remove(employee4);
		System.out.println("Set size after deleted : " + set.size());
		
		
		
	}

}
