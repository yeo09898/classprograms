
public class Arrays {
	// print out every elements in x separated by a space then one newline
	public static void print(int[] x) { // real name is Array.print
		// print out x
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");

		}
	}

	public static double sum(int[] a) {
		double s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}

	public static double mean(int[] a) {
		double m;
		m = sum(a) / (a.length);
		return m;
	}

	public static double prod(int[] a) {
		double p = 1;
		for (int i = 0; i < a.length; i++) {
			p *= a[i];
		}
		return p;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		print(a);// should print 1 2 3 4 5 6 7 8 9 10
		System.out.println();
		System.out.println(sum(a));
		System.out.println(mean(a));
		System.out.println(prod(a));
	}
}
