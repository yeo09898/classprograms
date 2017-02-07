
public class Vec3d {
	private double x, y, z;

	public Vec3d(double d, double e, double f) {
		x = d;
		y = e;
		z = f;
	}

	public Vec3d plus(Vec3d r) {
		return new Vec3d(x + r.x, y + r.y, z + r.z);
	}

	public static Vec3d plus(Vec3d m, Vec3d n) {
		return new Vec3d(m.x + n.x, m.y + n.y, m.z + n.z);
	}

	public Vec3d cross(Vec3d r) {
		return new Vec3d(y * r.z - z * r.y, z * r.x - x * r.z, x * r.y - y * r.x);
	}

	public static Vec3d cross(Vec3d m, Vec3d n) {
		return new Vec3d(m.y * n.z - m.z * n.y, m.z * n.x - m.x * n.z, m.x * n.y - m.y * n.x);
	}

	public double dot(Vec3d n) {
		return x * n.x + y * n.y + z * n.z;
	}

	public static double dot(Vec3d m, Vec3d n) {
		return m.x * n.x + m.y * n.y + m.z * n.z;
	}
	
	public Vec3d neg(){
		return new Vec3d(-x,-y,-z);
	}

	public String toString() {
		return "(" + x + "," + y + "," + z + ")";
	}

	public static void main(String[] args) {
		Vec3d v1 = new Vec3d(1.0, 2.5, 3.0);
		Vec3d v2 = new Vec3d(1.5, 1.0, 1.5);
		System.out.print("v1=");
		System.out.println(v1);
		System.out.print("v2=");
		System.out.println(v2);
		Vec3d v3 = v1.cross(v2);
		System.out.print("v3 = v1.cross(v2)=");
		System.out.println(v3);
		Vec3d v4 = Vec3d.cross(v1, v2);
		System.out.print("v4 = Vec3d.cross(v1, v2)=");
		System.out.println(v4);
		double a = v1.dot(v2);
		System.out.print("a = v1.dot(v2)=");
		System.out.println(a);
		double b = Vec3d.dot(v1, v2);
		System.out.print("b = Vec3d.dot(v1, v2)=");
		System.out.println(b);
		Vec3d v5 = v1.plus(v2);
		System.out.print("v5 = v1.plus(v2)=");
		System.out.println(v5);
		Vec3d v6 = Vec3d.plus(v1, v2);
		System.out.print("v6 = Vec3d.plus(v1,v2)=");
		System.out.println(v6);
		// Vec3d v7 = v1.times(v2);   Sorry. professor, I could not find the definition of times for Vector
		Vec3d v8 = v1.neg();
		System.out.print("v8 = v1.neg()=");
		System.out.println(v8);

	}
}
