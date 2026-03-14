package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class P1 {
	public static void main(String[] args) {
		//Unique Elements store in Set
		Set<Integer> hs = new HashSet<>();//Unordered Wise Elements
	//	Set<Integer> hs = new LinkedHashSet<>(); //Ordered Wise Elements
	//  	Set<Integer> hs = new TreeSet<>(); //Store in Sorted Ordered

		hs.add(12);
		hs.add(41);
		hs.add(32);
		hs.add(45);
		hs.add(10);
		hs.add(4);
		
		System.out.println(hs);
		
		hs.remove(12);
		System.out.println(hs);
		
		System.out.println(hs.contains(45));
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		
		hs.clear();
		
		System.out.println(hs);
	}

}
