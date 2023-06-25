package in.ineuron.main;

import java.util.Scanner;

public class Stack_Using_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		while (true) {

			System.out.println("Enter 1 to PUSH element in stack :: ");
			System.out.println("Enter 2 to POP element in stack :: ");
			System.out.println("Enter 3 to PEEK element in stack :: ");
			System.out.println("Enter 4 to check if stack is empty :: ");
			System.out.println("Enter 5 to exit :: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (st.push())
					System.out.println("Element pushed in stack...");
				else
					System.out.println("Stack Overflow...");
				break;
			case 2:
				if (st.pop())
					System.out.println("Element popped successfully...");
				else
					System.out.println("Stack Underflow...No element to pop...");
				break;
			case 3:
				st.peek();
				break;
			case 4:
				if (st.isEmpty())
					System.out.println("Stack is empty...");
				else
					System.out.println("Stack is not empty");
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
	class Stack<Integer> {

		int top = -1;
		int maxSize = 10;
		int[] a = new int[maxSize];

		boolean push() {
			if (top == maxSize - 1) {
				return false;
			} else {
				System.out.println("Enter the value to be pushed...");
				Scanner sc = new Scanner(System.in);
				int value = sc.nextInt();
				a[++top] = value;
				return true;
			}
		}

		boolean pop() {
			if (isEmpty()) {
				return false;
			} else {
				System.out.println("Element popped is :: "+a[top--]);
				return true;
			}
		}
		void peek() {
			if (isEmpty()) {
				System.out.println("Stack has no element...");
			} else {
				System.out.println("Element at top is :: "+a[top]);
			}
		}
		boolean isEmpty() {
			if (top == -1) 
				return true;
			else
				return false;
		

	}
}