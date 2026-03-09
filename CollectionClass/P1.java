package CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		List<Integer> cc = new ArrayList();
		cc.add(10);
		cc.add(3);
		cc.add(7);
		cc.add(2);
		cc.add(1);
		cc.add(4);
		
		System.out.println(Collections.min(cc));
		System.out.println(Collections.max(cc));
		System.out.println(Collections.frequency(cc, 1));
		
		Collections.sort(cc);
		System.out.println(cc);
		
		Collections.sort(cc, Comparator.reverseOrder());
		System.out.println(cc);
		
	}

}
