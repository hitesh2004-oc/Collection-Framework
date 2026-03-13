package Stack;

import java.util.Stack;

public class P1 {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		
		st.push("Cat");
		st.push("Dog");
		st.push("Horse");
		st.push("Lion");
		
		System.out.println(st);
		System.out.println(st.peek());
		
		String str = st.pop();
		
		System.out.println(st.peek());
		System.out.println(str);
	}

}
