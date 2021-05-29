package com.algorithms.linkedlist.stack;

public class EmployeeNode {

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

	@Override
	public String toString() {
		return emp.toString();
	}
	
	

}
