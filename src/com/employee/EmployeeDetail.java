package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetail {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));

		employees.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));

		employees.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));

		employees.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));

		employees.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

		employees.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));

		employees.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));

		employees.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));

		employees.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));
		
		Map<String, Long> collect = employees.stream().
				collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println("Number of Employee in each Department:"+ collect);
		
		Map<String, List<Employee>> collect1 = employees.stream().
				collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println("List of Employees in all Department:"+ collect1);
		
		
	}

}
