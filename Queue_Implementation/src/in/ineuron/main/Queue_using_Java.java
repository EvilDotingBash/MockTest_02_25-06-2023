package in.ineuron.main;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Queue_using_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new Queue<Integer>();
		while (true) {

			System.out.println("Enter 1 to ADD element in queue :: ");
			System.out.println("Enter 2 to DELETE element from queue :: ");
			System.out.println("Enter 3 to PEEK element in queue :: ");
			System.out.println("Enter 4 to check if queue is empty :: ");
			System.out.println("Enter 5 to exit :: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				q.enqueue();
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				if (q.isEmpty())
					System.out.println("Queue is empty...");
				else
					System.out.println("Queue is not empty");
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Wrong Choice...Plzz try again...");
				break;
			}
		}
	}
}

class Queue<Integer> {

	Node front = null;
	Node rear = null;

	void enqueue() {

		System.out.println("Enter the value to be pushed...");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		Node node = new Node(value);
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
		System.out.println("Element added successfully...");
	}

	void dequeue() {
		if (front == null) {
			System.out.println("Queue underflow...No element to delete...");
		} else {
			Node temp = front;
			front = front.next;
			if (front == null) {
				rear = null;
			}
			System.out.println("Element deleted is :: " + temp.data);
		}
	}

	void peek() {
		if (isEmpty()) {
			System.out.println("Queue has no element...");
		} else {
			System.out.println("Element at front is :: " + front.data);
		}
	}

	boolean isEmpty() {
		if (front == null && rear == null)
			return true;
		else
			return false;

	}
}