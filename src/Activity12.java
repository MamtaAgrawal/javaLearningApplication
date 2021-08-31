
public class Activity12 {

	public static void main(String[] args) {
		
		test t1 = (a,b)-> a+b;
		System.out.println(t1.sum(11, 23));
		 
		Addable add1 = (a,b) -> a+b;
		Addable add2 = (int a, int b) -> {
			return a+b;
		};
		
		System.out.println(add1.add(1, 2));
		System.out.println(add2.add(10, 20));
		/*
		 * add1.add(1, 2); add2.add(3, 4);
		 */
	}

}

interface test {
	int sum(int a , int b);
}
