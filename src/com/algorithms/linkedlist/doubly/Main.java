package com.algorithms.linkedlist.doubly;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Employee janeDoe = new Employee("Jane", "Doe", 8);
		Employee johnSmith = new Employee("John", "Smith", 7);
		Employee maryOlson = new Employee("Mary", "Olson", 6);
		Employee markBrooks = new Employee("Mark", "Brooks", 5);
		Employee davidDeason = new Employee("David", "Deason", 4);
		Employee dennisDavis = new Employee("Dennis", "Davis", 3);
		Employee paulaRobinson = new Employee("Paula", "Robinson", 2);
		Employee melissaWallace = new Employee("Melissa", "Wallace", 1);
		/*
		 * Employee paulaRobinson = new Employee("Paula", "Robinson", 88); Employee
		 * paulaRobinson = new Employee("Paula", "Robinson", 88); Employee paulaRobinson
		 * = new Employee("Paula", "Robinson", 88);
		 */

		EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

		// Check if the list is empty
		System.out.println("At the beginning the list is empty? " + list.isEmpty());
		// Print all Employee nodes from the list at this moment
		System.out.println(list.getSize());
		list.printEmployeeDoublyLinkedList();

		list.insertAtFront(new EmployeeNode(maryOlson));
		// Print all Employee nodes from the list after first insertion
		System.out.println(list.getSize());
		list.printEmployeeDoublyLinkedList();

		list.insertAtFront(new EmployeeNode(johnSmith));
		// Print all Employee nodes from the list 2nd insertion
		System.out.println(list.getSize());
		list.printEmployeeDoublyLinkedList();

		list.insertAtFront(new EmployeeNode(janeDoe));
		// Print all Employee nodes from the list 3rd insertion
		System.out.println(list.getSize());
		list.printEmployeeDoublyLinkedList();

		list.addToEnd(new EmployeeNode(melissaWallace));
		//insert at the tail of the list
		System.out.println(list.getSize());
		list.printEmployeeDoublyLinkedList();
		
		/*
		 * list.insertAtPosition(new EmployeeNode(paulaRobinson), 4); //insert at the
		 * tail of the list System.out.println(list.getSize());
		 * list.printEmployeeDoublyLinkedList();
		 */
		
		System.out.println("Removing node end");
		list.removeFromEnd();
		//insert at the tail of the list
		System.out.println(list.getSize());
		list.printEmployeeDoublyLinkedList();
		
		/*
		 * System.out.println("Removing node from position 2");
		 * list.removeFromPosition(2); //insert at the tail of the list
		 * System.out.println(list.getSize()); list.printEmployeeDoublyLinkedList();
		 * 
		 * System.out.println("Removing node front"); list.removeFromFront(); //insert
		 * at the tail of the list System.out.println(list.getSize());
		 * list.printEmployeeDoublyLinkedList();
		 */
		
		
	}

}
