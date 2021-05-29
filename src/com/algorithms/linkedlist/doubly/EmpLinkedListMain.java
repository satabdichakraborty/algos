package com.algorithms.linkedlist.doubly;

public class EmpLinkedListMain {

	public static void main(String[] args) {
		Employee janeDoe = new Employee("Jane", "Doe", 8);
		Employee johnSmith = new Employee("John", "Smith", 7);
		Employee maryOlson = new Employee("Mary", "Olson", 6);
		Employee markBrooks = new Employee("Mark", "Brooks", 5);
		Employee davidDeason = new Employee("David", "Deason", 4);
		Employee dennisDavis = new Employee("Dennis", "Davis", 3);
		Employee paulaRobinson = new Employee("Paula", "Robinson", 2);
		Employee melissaWallace = new Employee("Melissa", "Wallace", 1);
		
		EmpLinkedList emps = new EmpLinkedList();
		
		emps.insertAtFront(janeDoe);		
		emps.insertAtFront(johnSmith);
		emps.insertAtFront(paulaRobinson);		
		emps.insertAtFront(melissaWallace);
		System.out.println("List size after all inserts = "+emps.getSize());
		
		
		//emps.removeAtEnd(paulaRobinson);
		emps.removeAtEnd();
		
		System.out.println(emps.getSize());
		emps.printEmployeeDoublyLinkedList();
	}

}
