
public class Fraction {
	private int num, den;

	// constructor {automatically called whenever new
	// initializes the object
	public Fraction(int n, int d) {
		num = n;
		den = d;
	}

	public Fraction(int n) {
		num = n;
		den = 1;
	}

	// store 0/1
	public Fraction() {
		num = 0;
		den = 1;
	}

	/*
	 * public Fraction neg() { Fraction ans = new Fraction(); ans.num = -num;
	 * ans.den = den; return ans; }
	 */
	/*
	 * public Fraction neg() { Fraction ans = new Fraction(-num,den); return
	 * ans; }
	 */

	public Fraction neg() {
		return new Fraction(-num, den);
	}

	final int four = 4;
	final double PI = 3.14159265358979;

	public Fraction plus(Fraction right){
		//left side is called "this",right side is "right"
		//1/2 + 1/3
		return new Fraction(num * right.den + right.num * den, den * right.den);
		
	}
	public Fraction times(Fraction right) {
		return new Fraction(num * right.num,den*right.den);
	}
	public String toString() {
		return num + "/" + den;
	}

	public static void main(String[] args) {
		// principle of least surpise

		// if everything works a certain way, make your new object
		// work the same
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3); // 3/1
		Fraction f3 = new Fraction(); // 0/1
		System.out.print("f1=");
		System.out.println(f1);
		System.out.print("f2=");
		System.out.println(f2);
		System.out.print("f3=");
		System.out.println(f3);
		System.out.print("f1.neg()=");
		System.out.println(f1.neg());
		Fraction f4 = f1.plus(f2);
		Fraction f5 = f1.times(f2);
		System.out.print("f4 = f1.plus(f2)="); 
		System.out.println(f4);
		System.out.print("f5 = f1.times(f2)=");
		System.out.println(f5);
		 
	}
}
