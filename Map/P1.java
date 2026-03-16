package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P1 {
	public static void main(String[] args) {
	//	Map<String, Integer> m = new HashMap<>();
		Map<String, Integer> m = new TreeMap<>();

		// Internally store element in bucket list
		m.put("a", 10);
		m.put("b", 20);
		m.put("f", 30);
		m.put("d", 40);
		m.put("e", 50);
		
		System.out.println(m.containsKey("a"));
		System.out.println(m.containsValue(10));
		System.out.println(m.isEmpty());
		m.remove("e");
		
		// m.put("a", 60); [Override the Value]
//        if(!m.containsKey("a")) {
//        	m.put("a", 60); 
//        }
		
		m.putIfAbsent("a", 60); // Also same as If Condition
		System.out.println(m);
		
		for(Map.Entry<String, Integer> e: m.entrySet()) {
			System.out.println(e);
		}
		for(Map.Entry<String, Integer> e: m.entrySet()) {
			System.out.println(e.getKey());
		}
		for(Map.Entry<String, Integer> e: m.entrySet()) {
			System.out.println(e.getValue());
		}
		
	}

}
