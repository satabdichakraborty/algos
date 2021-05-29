package com.algorithms.linkedlist.singly;

public class EmployeeLinkedList {

	private EmployeeNode head;
	private int count;

	public void insertEmpAtFront(Employee emp) {

		EmployeeNode tempEmp = new EmployeeNode(emp);
		tempEmp.setNext(head);
		head = tempEmp;
		count++;
	}

	public int getSize() {
		int count = 0;
		EmployeeNode current = head;

		while (current != null) {
			current = current.getNext();
			++count;
		}
		return count;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}

	public void insertEmpAtPosition(Employee newEmp, int position) {

		EmployeeNode currentNode = head;
		int count = 1;

		while (count < position) {
			count++;
			currentNode = currentNode.getNext();
		}
		if (currentNode != null) {
			EmployeeNode nodeToKeep = new EmployeeNode(currentNode.getEmp());
			nodeToKeep.setNext(currentNode.getNext());
			currentNode.setEmp(newEmp);
			currentNode.setNext(nodeToKeep);
		} else {
			currentNode = new EmployeeNode(newEmp);
		}
	}

	public void printEmployeesInList() {
		EmployeeNode current = head;

		System.out.print("Head-->");

		while (current != null) {
			System.out.print(current + "-->");
			current = current.getNext();
		}
		System.out.println("null");

	}
}
