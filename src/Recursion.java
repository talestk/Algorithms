
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
	
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length -1);
	}
	
	public static int rank(int key, int[] a, int lo, int hi) {
		if (lo > hi) {
			return -1;
		}
		int mid = lo +(hi - lo) / 2;
		if (key < a[mid]) { 
			return rank(key,a,lo, mid-1);
		} 
		else if(key > a[mid]) { 
			return rank(key,a,mid+1, hi);
		} else return mid;
	
	}

}
