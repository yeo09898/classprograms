
public class Complexnumber {

	private double real, img;

	public Complexnumber(double a, double b) {
		real = a;
		img = b;
	}

	public Complexnumber(double a) {
		real = a;
		img = 0;
	}

	public Complexnumber() {
		real = 0;
		img = 0;
	}

	public Complexnumber plus(Complexnumber r) {
		return new Complexnumber(real + r.real, img + r.img);
	}

	public static Complexnumber plus(Complexnumber m, Complexnumber n) {
		return new Complexnumber(m.real + n.real, m.img + n.img);
	}

	public Complexnumber times(Complexnumber r) {
		return new Complexnumber(real * r.real - img * r.img, img * r.real + real * r.img);
	}

	public static Complexnumber times(Complexnumber m, Complexnumber n) {
		return new Complexnumber(m.real * n.real - m.img * n.img, m.img * n.real + m.real * n.img);
	}

	public Complexnumber div(Complexnumber r) {
		return new Complexnumber((real * r.real + img * r.img) / (r.real * r.real + r.img * r.img),
				(img * r.real - real * r.img) / (r.real * r.real + r.img * r.img));
	}

	public static Complexnumber div(Complexnumber m, Complexnumber n) {
		return new Complexnumber((m.real * n.real + m.img * n.img) / (n.real * n.real + n.img * n.img),
				(m.img * n.real - m.real * n.img) / (n.real * n.real + n.img * n.img));
	}

	public Complexnumber conj() {
		return new Complexnumber(real, -img);
	}

	public double mod() {
		return Math.sqrt(real * real + img * img);
	}

	public double re() {
		return real;
	}

	public double im() {
		return img;
	}

	public String toString() {
		if (img >= 0)
			return real + "+" + img + "i";
		else
			return real + "-" + -img + "i";
	}

	public static void main(String[] args) {
		Complexnumber c1 = new Complexnumber(1.5, 1.5);
		System.out.println("c1=" + c1);
		Complexnumber c2 = new Complexnumber(1.0);
		System.out.println("c2=" + c2);
		Complexnumber c3 = new Complexnumber();
		System.out.println("c3=" + c3);
		Complexnumber c4 = c1.plus(c2);
		System.out.println("c4=c1.plus(c2)=" + c4);
		Complexnumber c5 = Complexnumber.plus(c1, c2);
		System.out.println("c5 = Complexnumber.plus(v1,v2)=" + c5);
		Complexnumber c6 = c1.times(c2);
		System.out.println("c6 = c1.times(c2)=" + c6);
		Complexnumber c7 = Complexnumber.times(c1, c2);
		System.out.println("c7 = Complexnumber.times(c1, c2)=" + c7);
		Complexnumber c8 = c1.div(c2);
		System.out.println("c8 = c1.div( c2)=" + c8);
		Complexnumber c9 = Complexnumber.div(c1, c2);
		System.out.println("c9 = Complexnumber.div(c1, c2)=" + c9);
		Complexnumber c10 = c1.conj(); // Complex conjugate
		System.out.println("c10=c1.conj()=" + c10);
		double c11 = c1.mod();// the absolute value or modulus of the
								// complex number
		System.out.println("c11= c1.mod()=" + c11);
		double c12 = c1.re();
		System.out.println("c12= c1.re()=" + c12);
		double c13 = c1.im();
		System.out.println("c13=c1.im()=" + c13);
	}
}
