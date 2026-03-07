package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		List<Integer> newl = new ArrayList();
		newl.add(12);
		newl.add(13);
		newl.add(14);
		newl.add(15);
		list.addAll(newl);
		System.out.println(list);
		int a = list.get(4);
		System.out.println(a);
		System.out.println(newl.get(2));
		list.remove(Integer.valueOf(15));
		System.out.println(list);
		
		list.set(4,50);
		list.set(3,2121);
		System.out.println(list);
		
		System.out.println(list.contains(2121));
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(int ele:list) {
			System.out.println(ele);
		}
		System.out.println();
		Iterator<Integer> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}

}
