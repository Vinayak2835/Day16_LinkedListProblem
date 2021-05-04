package com.linkedlist;

public class Main {
	public static <T> void main(String[] args) {
        sortLinkedList<Integer> linkedList = new sortLinkedList<Integer>();
        Integer a = 56, b = 30, c = 40 ;

        linkedList.append(a);
        linkedList.append(c);
        linkedList.append(b);
        linkedList.display();
    }
}
