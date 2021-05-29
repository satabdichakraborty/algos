package com.algorithms.linkedlist.stack;

public class EmployeeStackLinkedListMain {

	public static void main(String[] args) {
		Employee janeDoe = new Employee("Jane", "Doe", 8);
		Employee johnSmith = new Employee("John", "Smith", 7);
		Employee maryOlson = new Employee("Mary", "Olson", 6);
		Employee markBrooks = new Employee("Mark", "Brooks", 5);
		Employee davidDeason = new Employee("David", "Deason", 4);
		Employee dennisDavis = new Employee("Dennis", "Davis", 3);
		Employee paulaRobinson = new Employee("Paula", "Robinson", 2);
		Employee melissaWallace = new Employee("Melissa", "Wallace", 1);
		
		EmployeeStackLinkedList stack = new EmployeeStackLinkedList();

		// Push
		System.out.println("Push operation starts here...");
		stack.push(melissaWallace);
		stack.push(paulaRobinson);
		stack.push(dennisDavis);
		stack.push(davidDeason);
		stack.push(markBrooks);
		System.out.println(stack.getSize());
		stack.printStack();
		
		System.out.println("Pop operation starts here...");
		stack.pop();
		System.out.println(stack.getSize());
		stack.printStack();
		
		System.out.println("Peek operation starts here...");
		System.out.println(stack.peek());
		System.out.println(stack.getSize());
		//stack.printStack();
	}

}
