package com.auribises;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}

		// (Head)10 9 8 7 6 5 4 3 2 1(Tail)
		
		// PQ sorts the data as well
		// (Head)1 2 3 4 5 6 7 8 9 10(Tail)
		
		/*
		// To read head of Queue
		System.out.println("Head is: "+queue.peek()); // 1
		System.out.println("Size of queue is: "+queue.size());
		// Remove head of Queue
		queue.poll();
		
		System.out.println("Head is: "+queue.peek()); // 2
		System.out.println("Size of queue now is: "+queue.size());
		*/
		
		for(int i=0;i<queue.size();i++){
			System.out.println("Head is: "+queue.peek());
			queue.poll();
		}
	}

}
