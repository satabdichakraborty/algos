package com.algorithms.linkedlist.stack;


public class EmployeeArrayStackMain {

	public static void main(String[] args) {
		Employee janeDoe = new Employee("Jane", "Doe", 8);
		Employee johnSmith = new Employee("John", "Smith", 7);
		Employee maryOlson = new Employee("Mary", "Olson", 6);
		Employee markBrooks = new Employee("Mark", "Brooks", 5);
		Employee davidDeason = new Employee("David", "Deason", 4);
		Employee dennisDavis = new Employee("Dennis", "Davis", 3);
		Employee paulaRobinson = new Employee("Paula", "Robinson", 2);
		Employee melissaWallace = new Employee("Melissa", "Wallace", 1);
		
		EmployeeArrayStack stack = new EmployeeArrayStack(10);
		
		//Push
		System.out.println("Push operation starts here...");
		stack.push(melissaWallace);
		System.out.println(stack.getSize());
		stack.printStack();
		
		stack.push(paulaRobinson);
		stack.push(dennisDavis);
		stack.push(davidDeason);
		stack.push(markBrooks);
		System.out.println(stack.getSize());		
		stack.printStack();
		
		//pop
		System.out.println("\n\nPop operation starts here...");
		stack.pop();
		stack.pop();
		System.out.println(stack.getSize());		
		stack.printStack();
		
		//peep
		System.out.println("\n\nPeep operation starts here...");
		stack.peep();
		//System.out.println(stack.getSize());		
		//stack.printStack();
	}
}
