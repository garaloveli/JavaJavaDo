package com.garaloveli.arrays;

import java.util.ArrayDeque;

public class Deque {
	
	public static void main(String[] args) {
		ArrayDeque deque = new ArrayDeque();
		deque.offerFirst("center");
		deque.offerFirst("Bruce Banner"); // could also call addFirst
		deque.offerLast("Barry Allen");
		deque.offerFirst("Bruce Wayne");
		deque.offerLast("Clark Kent");
		deque.offerFirst("Peter Parker");
		deque.offerLast("Hal Jordan");
		
		System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque.pollFirst());
		System.out.println(deque);
	}

}
