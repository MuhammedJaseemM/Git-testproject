package com.ibs.employee;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class SolutionD {

	public static void main(String[] args) {

		
		ArrayList<Employee> emp= new ArrayList<Employee>();
				emp.add(new Employee("102","John",2,"active","40000"));
				emp.add(new Employee("107","Peter",1,"inactive","80000"));
			    emp.add(new Employee("197","Harrold",3,"active","55000"));
				emp.add(new Employee("101","Tom",7,"active","30000"));
				emp.add(new Employee("121","Smith",2,"inactive","45000"));
				emp.add(new Employee("201","Kane",3,"inactive","25000"));
				emp.add(new Employee("185","Tony",7,"active","65000"));
				emp.add(new Employee("145","Steve",1,"active","20000"));
				emp.add(new Employee("225","Harry",3,"active","70000"));
				emp.add(new Employee("109","Will",2,"active","35000"));
	
		Integer max=emp.stream().mapToInt(p ->Integer.parseInt(p.getSalary())).max().orElseThrow(NoSuchElementException::new);
		System.out.println("Maximum salary is : "+max);
		
		Integer min=emp.stream().mapToInt(p ->Integer.parseInt(p.getSalary())).min().orElseThrow(NoSuchElementException::new);
		System.out.println("Minimum salary is : "+min);
	}

}
