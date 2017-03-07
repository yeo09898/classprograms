import java.io.File;
import java.util.Scanner;

public class read {
	private static double[][] dat = new double[14][10];
	private static int i = 0;
	private static int j = 0;
	private static String[] name =new String[14], Orbits =new String[14];
	//int[][] t = {{1,2,3},{2,3,1},{3,1,2}};


	public static void main(String[] a) {
		
		try {
			String current = new java.io.File(".").getCanonicalPath();
			System.out.println("Current dir:" + current);
			Scanner s = new Scanner(new File("solarsystem.dat"));
			// Scanner s = new Scanner(System.in);
			s.nextLine();
			while (s.hasNext()) {
				j = 0;
				String na=name[i] = s.next();
				String Or=Orbits[i] = s.next();
				double mass = s.nextDouble();
				dat[i][j] = mass;
				j = j + 1;
				double Diam = s.nextDouble();
				dat[i][j] = Diam;
				j = j + 1;
				double Per = s.nextDouble();
				dat[i][j] = Per;
				j = j + 1;
				double Aphelion = s.nextDouble();
				dat[i][j] = Aphelion;
				j = j + 1;
				double orbPeriod = s.nextDouble();
				dat[i][j] = orbPeriod;
				j = j + 1;
				double rotationalPeriod = s.nextDouble();
				dat[i][j] = rotationalPeriod;
				j = j + 1;
				double axialtilt = s.nextDouble();
				dat[i][j] = axialtilt;
				j = j + 1;
				double orbinclin = s.nextDouble();
				dat[i][j] = orbinclin;
				j = j + 1;
				i = i + 1;
				/* System.out.println(na + "\tOrbits " + Or + "\tmass=" +
				 mass+"\tDiam="+Diam+"\tPerihelion="+Per+"\tAphelion="+Aphelion+"\torbPeriod(days)="+orbPeriod+"\trotationalPeriod(hours)="+rotationalPeriod+"\taxialtilt(deg)="+axialtilt+"\torbinclin(deg)"+
				 orbinclin);*/
			}
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int m=0;m<dat.length;m++){
			dat[m][8]=(dat[m][2] + dat[m][3]) / 2;
			dat[m][9]=(6.67408E-11*dat[0][0])/(dat[m][8]*dat[m][8]);
		}
		System.out.println("Plants" + "\tx" + "\ty" + "\tz" + "\tacceleration");
		for (int n = 0; n < 14; n++) {
			System.out.println(name[n]+"\t"+dat[n][8] +"\t"+0+"\t"+0+"\t"+dat[n][9]);
		}
	}
}
