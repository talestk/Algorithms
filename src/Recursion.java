
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1.1.16 " + exR1(1));
	}
	
	public static int exR1(int n) {
		if(n <= 0) return 0;
		System.out.println(n);
		return exR1(n-3) + n + exR1(n-2) + n;
	}
}
