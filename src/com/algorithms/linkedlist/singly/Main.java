package com.algorithms.linkedlist.singly;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee janeDoe = new Employee("Jane", "Doe", 123);
		Employee johnSmith = new Employee("John", "Smith", 456);
		Employee maryOlson = new Employee("Mary", "Olson", 78);
		Employee markBrooks = new Employee("Mark", "Brooks", 90);
		Employee paulaRobinson = new Employee("Paula", "Robinson", 88);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Jane", "Doe", 123));
		employees.add(new Employee("John", "Smith", 456));
		employees.add(new Employee("Mary", "Olson", 78));
		employees.add(new Employee("Mark", "Brooks", 90));

		/*
		 * for (Employee e : employees) { System.out.println(e); }
		 */
		
		EmployeeLinkedList emps = new EmployeeLinkedList();
		System.out.println("Is the list empty? : " +emps.isEmpty());
		emps.insertEmpAtFront(janeDoe);
		emps.insertEmpAtFront(johnSmith);
		emps.insertEmpAtFront(maryOlson);
		emps.insertEmpAtFront(markBrooks);

		emps.insertEmpAtPosition(paulaRobinson, 5);

		emps.printEmployeesInList();

		System.out.println("No of employees in the list = " + emps.getSize());

	}

}
