package linkedlist;

import java.util.Scanner;

class Node{
	
	int data;
	Node next;
	Node prev;
	Node(int key) {
		data = key;
	}
}
class Linkedlist {
Node head;
public void create(int d) {
	Node node = new Node(d);
	node.next = null;
	node.prev = null;
	head = node;
}
public void addbeg(int d) {
	Node node = new Node(d);
	if (head == null) {
		head = node;
		node.prev = null;
		node.next = null;
	}
	else {
	head.prev = node;
	node.next = head;
	head = node;
	}
}
public void addend(int d) {
	Node temp = head;
	while (temp.next != null) {
		temp = temp.next;
	}
	Node node = new Node(d);
	temp.next = node;
	node.prev = temp;
	node.next = null;
}
public void delete(int pos) {
	Node temp = head;
	while (pos != 1) {
		pos--;
		temp = temp.next;
	}
	temp.next.next.prev = temp;
	temp.next = temp.next.next;
}
public void traverse() {
	Node temp = head;
	while (temp != null) {
		System.out.print(temp.data+"->");
		temp = temp.next;
	}
	System.out.println();
}
}

public class Doublylinkedlist {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l = new Linkedlist();
		while(true) {
		System.out.println("1.create linked list");
		System.out.println("2.delete node");
		System.out.println("3.search node");
		System.out.println("4.print the list");
		System.out.println("5.add node at beginning");
		System.out.println("6.add node at end");
		System.out.println("enter the option"); 
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int o = sc.nextInt();
		switch(o) {
		case 1:System.out.println("enter the data");
		       int d = sc.nextInt();
		       l.create(d);
			   break;
		case 2:System.out.println("eneter the position");
		       int p = sc.nextInt();
		       l.delete(p);
		       break;
		case 4:l.traverse();
		       break;
		case 5:System.out.println("enter the data");
	       		int d2 = sc.nextInt();
	       		l.addbeg(d2);
	       		break;
		case 6:System.out.println("enter the data");
		       int m = sc.nextInt();
		      l.addend(m);
		       break;
		default:System.out.println("enter a valid choice");
		}
		}

	}

}
