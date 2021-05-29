package com.algorithms.linkedlist.stack;

public class EmployeeArrayStack {

	Employee[] employees;
	int top;
	int capacity;

	public EmployeeArrayStack() {

		capacity = 10;
		top = 0;
		employees = new Employee[capacity];

	}

	public EmployeeArrayStack(int capacity) {
		top = 0;
		employees = new Employee[capacity];

	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int getSize() {
		return top;
	}

	public void push(Employee emp) {

		if (employees.length == capacity) {
			Employee[] newArray = new Employee[2 * capacity];
			System.arraycopy(employees, 0, newArray, 0, employees.length);
			employees = newArray;
		}
		employees[top++] = emp;

	}

	public Employee pop() {
		Employee poppedItem;
		if (isEmpty()) {
			System.out.println("Employee stack is empty");
		}
		poppedItem = employees[--top];
		employees[top] = null;
		return poppedItem;
	}

	public Employee peep() {
		Employee peekItem;
		if (isEmpty()) {
			System.out.println("Employee stack is empty");
		}
		peekItem = employees[top-1];
		System.out.println("Peep item = "+peekItem);
		return peekItem;
	}

	public void printStack() {
		System.out.println("Here are all the stack items -->");
		int size = getSize();
		for (int i = size-1; i>=0; i--) {
			System.out.println(employees[i]);
		}
	}
}
