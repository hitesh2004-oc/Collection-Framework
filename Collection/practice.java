package Collection;
import java.util.*;

public class practice{
         public static void main(String[] args) {
			
 // --------------- List -------------------//
            

     /*  Allows duplicate elements.

        	 Maintains insertion order.

        	 Elements can be accessed using index.

        	 Allows multiple null values.

        	 Implemented by ArrayList, LinkedList, Vector.*/	 
        	 
        	 
        	 
        	 // 1.ArrayList 
        	 
     /* Uses dynamic array internally.

        Fast random access (get() is fast).

        Slower insertion/deletion in middle.

        Allows duplicate and null values.
        
        Index based insertion 
        Not synchronized. */
        	 
        	 ArrayList al = new ArrayList();
        	 al.add(" al 1");
        	 al.add(" al 2");
        	 
        	 List<String> names = new ArrayList<>();

             names.add("Vinod");
             names.add("Rahul");
             names.add("Vinod"); // duplicate allowed
             names.add(2, "Java" );
             names.addAll(al);
             names.addAll(1, al);
             names.addFirst("hitesh");
             names.addLast("good job");
             
             System.out.println(names);

        	 
        	 
             
         //LinkedList
             
    /* Uses doubly linked list.

     Faster insertion and deletion.

     Slower access compared to ArrayList.

     Can act as List, Deque.

     Allows duplicates and nulls.*/         
             
             
         LinkedList list = new LinkedList();

             list.add(10);
             list.add(20);
             list.add(30);
             list.add(2,40 );
        

             System.out.println(list);
             System.out.println(list.peekLast());
             System.out.println(list);
             System.out.println(list.poll());
             System.out.println(list);
             
             
         // --------------- Set -------------------//  
          
         /*  Does not allow duplicate elements.

             No index-based access.

             Can contain at most one null (depends on implementation).

             Used when uniqueness is required.

             Implemented by HashSet, LinkedHashSet, TreeSet. */
             
             
         //HashSet
             
          /* Uses HashMap internally.

             No insertion order guarantee.

             Allows one null value.
             
             duplicate value not allowed
              
             Fast performance (O(1)).

             Not synchronized. */
             
         Set<Integer> set = new HashSet<>();

             set.add(10);
             set.add(20);
             set.add(10); // ignored

             System.out.println(set);    
             
             
         //LinkedHashSet 
             
          /* Maintains insertion order.

             Slightly slower than HashSet.

             Allows one null value.

             Uses HashTable + Linked List.

             Useful when order matters. */
             
             
         Set<String> set2 = new LinkedHashSet<>();

             set2.add("A");
             set2.add("B");
             set2.add("A");
           
             System.out.println(set2);  
             
         
        // TreeSet
            
            /*Stores elements in sorted order.

            Uses binary search tree , balance tree .

            Does not allow null elements.

            Slower than HashSet.

            Implements NavigableSet. */
             
        Set<Integer> set3 = new TreeSet<>();

             set.add(30);
             set.add(10);
             set.add(20);

             System.out.println(set); // sorted 
             
             
       //-------------- Queue -------------- // 
            
             /*Follows FIFO principle.

             Used for processing elements.
 
             No random access.

             Methods: add, offer, poll, peek.

             Implemented by PriorityQueue, ArrayDeque. */
             
             
       // Priority Queue
             
           /*  Elements ordered by priority, not FIFO.
              
             it will follow min heap internally 
              
             Default natural ordering.

             Does not allow null values.

             Not thread-safe.

             Used in scheduling. */
             
             
        Queue<Integer> queue = new PriorityQueue<>();

             queue.add(30);
             queue.add(10);
             queue.add(20);

             System.out.println(queue);
             System.out.println(queue.poll()); // removes smallest 
         
      
      // ------------- Dequeue ---------------- //
             
             
           /*  Allows insertion and removal at both ends.

             Can act as stack or queue.

             Faster than Stack class.

             Implemented by ArrayDeque.

             No capacity restrictions. */
             
             
             
       // ArrayDequeue
             
             
        Deque<String> deque = new ArrayDeque<>();

             deque.addFirst("A");
             deque.addLast("B");

             System.out.println(deque); 
      
             
             
      //--------------- Map ------------------ //
          
           /*   Stores data in key-value pairs.

             Keys are unique; values can be duplicate.

             One key maps to one value.

             Not a child of Collection interface.

             Implemented by HashMap, LinkedHashMap, TreeMap, Hashtable. */
             
             
       // HashMap
             
            /* No insertion order guarantee.

             Allows one null key and multiple null values.

             Not synchronized.

             Fast performance.

             Uses hashing technique. */
             
             
       Map<Integer, String> map = new HashMap<>();

             map.put(1, "Java");
             map.put(2, "Python");
             map.put(1, "C++"); // overrides

             System.out.println(map); 
             
             
         
       //LinkedHashMap 
             
          /*   Maintains insertion order.

             Slightly slower than HashMap.

             Allows one null key.

             Useful for cache-based applications.

             Not synchronized. */
             
             
      LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();

             map2.put(1, "Java");
             map2.put(2, "Python");
             map2.put(3, "C++");

             // Normal old-style iteration
             for (Integer key : map2.keySet()) {   // basic loop
                 System.out.println(key + " = " + map2.get(key));
             } 
             
             
      //TreeMap
             
           /*  Stores keys in sorted order.

             Uses Red-Black Tree.

             Does not allow null keys.

             Slower than HashMap.

             Implements NavigableMap. */
             
             
        TreeMap<Integer, String> map3 = new TreeMap<>();

             map3.put(3, "Java");
             map3.put(1, "Python");
             map3.put(2, "C++");

             // Normal iteration
             for (Integer key : map3.keySet()) {
                 System.out.println(key + " = " + map3.get(key));
             }      
        	 
             
       //HashTable
             
           /*  Synchronized and thread-safe.

             Does not allow null key or value.

             Legacy class.

             Slower performance.

             Rarely used now. */
             
             
        Hashtable<Integer, String> table = new Hashtable<>();

             table.put(1, "Java");
             table.put(2, "Python");
             table.put(3, "C++");

             // Old legacy way (Enumeration)
             Enumeration<Integer> keys = table.keys();

             while (keys.hasMoreElements()) {
                 Integer key = keys.nextElement();
                 System.out.println(key + " = " + table.get(key));
             }  
             
             
             
      //--------------------------------------------------------------------------------//
             
             // iterating in data structure 
          
        // For Each 
              
             /* Use When:

            	 Just reading data

            	 No removal or modification

            	 Clean & readable code */
             

             List<String> list2 = new ArrayList<>();
             list2.add("Java");
             list2.add("Python");
             list2.add("C++");

             // for-each loop
             for (String lang : list2) {
                 System.out.println(lang);
             }
             
         
             
        // iterator 
             
         /*    You need to remove elements

             Forward direction only

             Works for all collections */
             
             List<Integer> list3 = new ArrayList<>();
             list3.add(10);
             list3.add(20);
             list3.add(30);

             Iterator<Integer> it = list3.iterator();

             while (it.hasNext()) {
                 Integer val = it.next();

                 if (val == 20) {
                     it.remove(); // safe removal
                 }
             }

             System.out.println(list3);  
         
             
        // List Iterator 
             
          /*   Need forward & backward traversal

             Need to add/modify elements

             Only works with List   */
             
             
             List<String> list4 = new ArrayList<>();
             list4.add("A");
             list4.add("B");
             list4.add("C");

             ListIterator<String> it2 = list4.listIterator();

             // Forward direction
             while (it2.hasNext()) {
                 System.out.println(it2.next());
             }

             // Backward direction
             while (it2.hasPrevious()) {
                 System.out.println(it2.previous());
             }
           
             
             
             
         // Enumeration 
             
          /*    Working with legacy code

             Only read operation

             Not fail-fast */
             
             
             Hashtable<Integer, String> table2 = new Hashtable<>();
             table2.put(1, "Java");
             table2.put(2, "Python");

             Enumeration<Integer> e = table2.keys();

             while (e.hasMoreElements()) {
                 Integer key = e.nextElement();
                 System.out.println(key + " = " + table2.get(key));
             }
             
             
	}
}