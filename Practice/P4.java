package Practice;

import java.util.function.Predicate;

public class P4 {
	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> {if(i%2==0) {return true;}else {return false;}};
        System.out.println(p1.test(10));
	}

}
