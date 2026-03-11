package ArrayDeque;

import java.util.ArrayDeque;

public class P1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.offer(10);
		ad.addFirst(5);
		ad.offerLast(20);
		ad.offer(40);
		
		System.out.println(ad);
		
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad.poll());
		System.out.println(ad);
		
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		
		System.out.println(ad.pollLast());
		System.out.println(ad);
		
	}

}
