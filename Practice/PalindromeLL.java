package com.practice.java;
import java.util.Stack;

public class PalindromeLL {

	 static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	};

	static class main {

		public static boolean isPalindrome(Node head) {

			Stack<Integer> s = new Stack<>();

			// push all elements of linked list into stack
			Node node = head;
			while (node != null) {
				s.push(node.data);
				node = node.next;
			}

			// traverse the linked list again
			node = head;
			while (node != null) {

				// pop the element from the Stack
				int top = s.pop();

				// compare the popped element with current node's data
				if (top != node.data) {
					return false;
				}
				// advance to the next node
				node = node.next;
			}

			return true;
		}
		
		public static void main(String[] args) {
			
			Node head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			head.next.next.next = new Node(3);
			head.next.next.next.next = new Node(1);
			
			if(isPalindrome(head)) {
			  System.out.print("Linked list is a palindrome");
			}else {
				System.out.print("Linked list is not a palindrome");
			}
		}
	}
}
