package Test;

import java.util.ArrayDeque;

// Internall Working of ArrayDeque
public class P1 {
	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		// ArrayDeque implement Deque
		// In ArrayDeque,We can Add and Remove Element in both Frontend and Rear End
		
		// Add normally add element from Rear End
		ad.add(10);
		ad.add(20);
		
        // addFirst add element from Front End
		ad.addFirst(30);
		ad.addFirst(40);
		
		// addLast add element from Rear End
		ad.addLast(50);
		ad.addLast(60);
		
		// remove method use for delete element from ArrayDeque
//		ad.remove(40);
		
		// poll method use for remove element from Front end in ArrayDeque
//		ad.poll();	
		
		// peek method use for see or print element from Front end in ArrayDeque
//		System.out.println(ad.peek());
		
		// pollFirst method use for remove element from Front end in ArrayDeque
//		ad.pollFirst();
		
		// pollFirst method use for remove element from Rear end in ArrayDeque
//		ad.pollLast();
		
		ad.pop();
//		ad.push(null);
		System.out.println(ad);
		
	}

}
