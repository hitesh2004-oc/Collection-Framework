package Collection;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

public class P1 {
	public static void main(String[] args) { 
	/* In Collection Framework , Framework is a semi develeoped code or Predefine code
	 * it is a collection of Classes and inerfaces and inside the class and interface 
	 * there are multiple method using those method we can achieve data structure.
	 * Using framework we can create repid application no need to create manually
	 * 
	 * before collection framework introduce there are Legacy classes like stack , vector,
	 * dictionary, properties, hashtable
	 * 
	 * collection is group of object in to single unit
	 * 
	 * For Achieving data structure we use collection framework[classes & interfaces methods]
	 * 
	 * When we face the problem with java core and array because Array is static and fixed sized
	 * and we can only store homogenous type in array
	 * to solve this problem we use legacy class
	 * 
	 * All Legacy class is a synchronized and thread safe
	 * legacy class is a part of java.util packages
	 * 
	 * in vector we can store heterogenous type or it is non genoric type 
	 * it is also store null value and duplicate value
	 * for store element in vetcor we use addelement
	 * 
	 */
       Vector v = new Vector(); //Heterogenous // Slow Performance in insertion and delete  // Allow both null and Duplicate Value
       v.add(10);               // Follow Insertion Order
       v.add(0, "hitesh"); 
       v.add(0, true);
       v.addFirst(1.22);
       v.addElement(20);
       v.addAll(v);
       //System.out.println(v);
       
       Dictionary d = new Hashtable();
       d.put("B", 10);
       d.put("A", 20);
    //   System.out.println(d);
    //   d.put(null, 20);
       
    //   System.out.println(d.get("B"));
    //   System.out.println(d);
//       Enumeration<Integer> k1 = d.elements();
//       System.out.println(k1.hasMoreElements());
//       System.out.println(k1.nextElement());
//       Enumeration<String> k = d.keys();
//       while (k.hasMoreElements()) {
//           String key = k.nextElement();
//           System.out.println("Key: " + key + ", Value: " + d.get(key));
//       }
//       
      Properties p = new Properties();
      p.put("B", 10);
      p.put("A", "hitesh");
     // System.out.println(p);
      p.put(1,"hitesh");
      // int old = (int) p.put("B", "hitesh");
     
      // System.out.println(old);
    //  System.out.println(p);
//      Enumeration e = p.keys();
//      while(e.hasMoreElements()) {
//    	       String s =  (String) e.nextElement();
//    	       Object o = p.get(s);
//    	       System.out.println(o);
//      }
    
      List l = new ArrayList();
      l.add(1);
      l.add(2);
      l.add(3);
      l.add(1,3);
      System.out.println(l);
      
      
   
      
       
       
       
       
       
		
	 
	
	}

}
