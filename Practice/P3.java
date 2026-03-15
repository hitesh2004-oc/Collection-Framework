package Practice;

interface I{
	void showAddition(int a,int b); //SAM[Single Abstract Method
    }
public class P3 {
	public static void main(String[] args) {
		I i1 = (a,b) -> System.out.println(a+b);
		
		i1.showAddition(10,20);
	}

}
