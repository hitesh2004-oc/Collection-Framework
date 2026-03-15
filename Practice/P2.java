package Practice;

public class P2 {
public static void main(String[] args) throws P1{
	int value = 10;
	if(20<value) {
		System.out.println("hi");
	}
	else {
		throw new P1("Error");
	}
}
}
