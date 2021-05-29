package com.algorithms.linkedlist.doubly;

public class EmployeeNode {

	private EmployeeNode previous;
	private Employee emp;
	private EmployeeNode next;

	/* Constrator */
	public EmployeeNode(Employee emp) {
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return emp.toString();
	}

}
