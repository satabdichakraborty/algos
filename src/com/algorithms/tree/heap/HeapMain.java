package com.algorithms.tree.heap;

public class HeapMain {

	public static void main(String[] args) {

		//checkInsert();
		checkDelete();

	}

	private static void checkDelete() {
		Heap heap = new Heap(10);
		heap.insert(80);// 0-->22
		heap.insert(75);// 1-->19
		heap.insert(60);// 3-->16
		heap.insert(68);// 4-->15
		heap.insert(55); // 5-->3
		heap.insert(40);// 6-->14
		heap.insert(52); // 7-->4
		heap.insert(67);
		heap.printHeap();
		
		heap.delete(75);
		heap.printHeap();
		heap.delete(80);
		heap.printHeap();

	}

	private static void checkInsert() {
		Heap heap = new Heap(10);

		heap.insert(22);// 0-->22
		heap.insert(19);// 1-->19
		heap.insert(16);// 3-->16
		heap.insert(15);// 4-->15
		heap.insert(3); // 5-->3
		heap.insert(14);// 6-->14
		heap.insert(4); // 7-->4
		heap.insert(12);// 8-->12
		heap.printHeap();
		// Heap now
		// 22 19 16 15 3 14 4 12 0 0
		heap.insert(20);// 9-->20
		// Heap after this insert
		// 22 19 16 20 3 14 4 12 15 0
		heap.printHeap();
	}

}
