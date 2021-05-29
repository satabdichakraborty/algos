package com.algorithms.tree.heap;

public class Heap {

	int[] heap;
	int size;

	public Heap(int capacity) {
		this.heap = new int[capacity];
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isFull() {
		return (size == heap.length) ? true : false;
	}

	public int getChildIndex(int parentIndex, boolean leftChild) {
		// return leftChild == true ? (2 * parentIndex) + 1 : (2 * parentIndex) + 2;
		return 2 * parentIndex + (leftChild ? 1 : 2);
	}

	public int getParentIndex(int index) {
		return (index - 1) / 2;
	}

	public void insert(int newData) {

		if (isFull()) {
			throw new ArrayIndexOutOfBoundsException("Array is full");
		} else {
			heap[size] = newData;
			heapifyAbove(size, newData);
			size++;
		}
	}

	private void heapifyAbove(int size, int newData) {
		int position = size;
		int parentIdx = getParentIndex(position);

		while (position > 0 && heap[parentIdx] < heap[position]) {

			heap[position] = heap[parentIdx];
			position = parentIdx;

		}
		heap[position] = newData;
	}

	public void delete(int data) {

		if (getSize() == 0) {
			throw new ArrayIndexOutOfBoundsException("Array is empty");
		}

		int deleteIndex = getElementIndex(data);
		heap[deleteIndex] = heap[--size];
		heap[size] = 0;

		if (deleteIndex == 0 || (heap[deleteIndex] < heap[getParentIndex(deleteIndex)])) {
			heapifyBelow(deleteIndex, size);
		} else {
			heapifyAbove(deleteIndex, data);
		}
	}

	private void heapifyBelow(int deleteIndex, int lastHeapIndex) {

		int childToSwap;

		while (deleteIndex <= size) {

			int leftChidIndex = getChildIndex(deleteIndex, true);
			int rightChidIndex = getChildIndex(deleteIndex, false);

			if (leftChidIndex <= lastHeapIndex) {

				if (rightChidIndex > lastHeapIndex) {
					childToSwap = leftChidIndex;
				} else {
					childToSwap = (heap[leftChidIndex] > heap[rightChidIndex] ? leftChidIndex : rightChidIndex);
				}
				if (heap[deleteIndex] < heap[childToSwap]) {
					swap(childToSwap, deleteIndex);
				} else {
					break;
				}
				deleteIndex = childToSwap;
			} else {
				break;
			}
		}
	}

	private void swap(int leftChidIndex, int deleteIndex) {
		int temp = heap[leftChidIndex];
		heap[leftChidIndex] = heap[deleteIndex];
		heap[deleteIndex] = temp;
	}

	private int getElementIndex(int data) {
		int pos = -1;
		for (int i = 0; i < heap.length; i++) {
			if (heap[i] == data) {
				pos = i;
			}
		}

		return pos;
	}

	public void printHeap() {
		System.out.println("Heap -->");
		for (int i : heap) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
