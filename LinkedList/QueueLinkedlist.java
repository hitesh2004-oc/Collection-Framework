package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlist {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		System.out.println(q);
		System.out.println(q.peek());
		
		int i = q.poll();
		
		System.out.println(i);
		System.out.println(q);
		System.out.println(q.peek());
		
	}

}
