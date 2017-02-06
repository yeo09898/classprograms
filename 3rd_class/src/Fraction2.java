
public class Fraction2 {
	private int num, den;

	public Fraction2(int n, int d) {
		num = n;
		den = d;
	}

	public String toString() {
		return num + "/" + den;
	}

	// this
	public Fraction2 add(Fraction2 r) {
		// this.num this.den r.num r.den
		return new Fraction2(num * r.den + r.num * den, den * r.den);
	}

	public static void main(String[] a) {
		Fraction2 f1 = new Fraction2(1, 2); // f1=1/2
		Fraction2 f2 = new Fraction2(1, 3); // f2=1/3
		System.out.println(f1);
		System.out.println(f2);
		Fraction2 f3 = f1.add(f2);
		System.out.println(f3);
		// f1.print();
		// f2.print();
		// object oriented principle: all object have a unique identity

		// Fraction f3 =f1+f2;// only C++,sorry!
		// Fraction f3 = f1.add(f2);
		// Fraction f4 = add(f1,f2);
		// System.out.println(f4);

	}

}
