/*
 * http://aa.usno.navy.mil/faq/docs/JD_Formula.php
 * https://en.wikipedia.org/wiki/Julian_day
 * 
 * 365 days per year
 * in a leap year:   leap year is MOD 4 == 0 (divisible by 4) leap year
 *  BUT if it's divisible by 100 MOD 100 = 0  (NOT a leap year)
 *  BUT if it's divisble by 400 MOD 400 == 0  IS a leap year
 *  2004 LEAP
 *  2000 LEAP (divisible by 400)
 *  1900 NOT LEAP
 *  1600 LEAP 
 * 
 * J2000		(year - 2000)*365 + leap....
 * 
 * fractional hh:mm:ss		23:50:20 = 23/24.0	+ 50/(24*60.0) + 20/(24*60*60.0) 
 * 
 * 
 */
public class JulianDate {
	private double jday;
	private int year, month, day, hour, minute, second;
	// private final double J2000 = 0; // Jan 1, 2000 = jday 0
	// Jan. 2, 2000 = 1
	// Jan. 3, 2000 = 2
	// int x[], y; // x is an arry, y is an int
	// int[] x,y; // x and y are both arrays
	private static String monthNames[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };

	public static double sign(double x) {
		if (x >= 0)
			return 1;
		else
			return -1;
	}

	public JulianDate(int y, int m, int d) {
		jday = d - 32075 + 1461 * (y + 4800 + (m - 14) / 12) / 4 + 367 * (m - 2 - (m - 14) / 12 * 12) / 12
				- 3 * ((y + 4900 + (m - 14) / 12) / 100) / 4;
		year = y;
		month = m;
		day = d;
		hour = 0;
		minute = 0;
		second = 0;
	}

	public JulianDate(int y, int m, int d, int h, int min, int sec) {
		jday = d - 32075 + 1461 * (y + 4800 + (m - 14) / 12) / 4 + 367 * (m - 2 - (m - 14) / 12 * 12) / 12
				- 3 * ((y + 4900 + (m - 14) / 12) / 100) / 4 + h / 24.0 + min / (24.0 * 60) + sec / (24.0 * 60 * 60);
		year = y;
		month = m;
		day = d;
		hour = h;
		minute = min;
		second = sec;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getMonthName() {
		return monthNames[month - 1];
	}

	public double minus(JulianDate a) {
		return jday - a.jday;
	}

	public JulianDate plus(double add) {
		return reverse(this.jday + add);
	}
	
	public void setTime(int h,int min,int sec){
		hour=h;
		minute=min;
		second=sec;
		
	}

	public JulianDate reverse(double d) {
		int L = 0, N = 0;
		double inday = 0;
		L = (int) d + 68569;
		N = 4 * L / 146097;
		L = L - (146097 * N + 3) / 4;
		year = 4000 * (L + 1) / 1461001;
		L = L - 1461 * year / 4 + 31;
		month = 80 * L / 2447;
		day = L - 2447 * month / 80;
		L = month / 11;
		month = month + 2 - 12 * L;
		year = 100 * (N - 49) + year + L;
		inday = d - (int) d;
		inday = inday * 86400;
		hour = (int)(Math.round (inday / (60 * 60)));
		minute = (int) (Math.round ((inday - hour * 3600) / 60));
		second = (int) (Math.round ((inday - hour * 3600 - minute * 60)));
		return new JulianDate(year, month, day, hour, minute, second);
	}

	public String toString() {
		if (hour >= 10) {
			if (minute >= 10) {
				if (second >= 10) {
					return year + " " + monthNames[month - 1] + ". " + day + " " + hour + ":" + minute + ":" + second;
				} else {

					return year + " " + monthNames[month - 1] + ". " + day + " " + hour + ":" + minute + ":" + 0
							+ second;
				}
			} else {
				if (second >= 10) {
					return year + " " + monthNames[month - 1] + ". " + day + " " + hour + ":" + 0 + minute + ":"
							+ second;
				} else {
					return year + " " + monthNames[month - 1] + ". " + day + " " + hour + ":" + 0 + minute + ":" + 0
							+ second;
				}
			}
		} else {
			if (minute >= 10) {
				if (second >= 10) {
					return year + " " + monthNames[month - 1] + ". " + day + " " + 0 + hour + ":" + minute + ":"
							+ second;
				} else {

					return year + " " + monthNames[month - 1] + ". " + day + " " + 0 + hour + ":" + minute + ":" + 0
							+ second;
				}
			} else {
				if (second >= 10) {
					return year + " " + monthNames[month - 1] + ". " + day + " " + 0 + hour + ":" + 0 + minute + ":"
							+ second;
				} else {
					return year + " " + monthNames[month - 1] + ". " + day + " " + 0 + hour + ":" + 0 + minute + ":" + 0
							+ second;
				}
			}
		}
	}

	public static void main(String[] args) {
		JulianDate j = new JulianDate(2017, 1, 1); // 00:00:00
		JulianDate j2 = new JulianDate(2017, 1, 1, 12, 0, 0); // 12:00:00
		JulianDate j3 = new JulianDate(2017, 2, 13, 16, 11, 0);
		System.out.println(j + "\t" + j2 + "\t" + j3); // 2017 Jan. 1 00:00:00
		JulianDate j4 = j3.plus(5.5); // add days
		System.out.println(j4);
		int year = j3.getYear(); // 2017
		System.out.println(year);
		int mon = j3.getMonth(); // 2
		System.out.println(mon);
		int day = j3.getDay(); // 13
		System.out.println(day);
		String monthName = j3.getMonthName();
		System.out.println(monthName); 
		double diff = j4.minus(j3);
		System.out.println(diff);
		j4.setTime(4, 30, 0); // keep the same day, but set time
		System.out.println(j4);
		JulianDate j5 = new JulianDate(2016, 2, 29, 12, 0,0); //xxx.5
		System.out.println(j5);
		JulianDate j6 = j5.plus(1);
		System.out.println(j6);
		JulianDate j7 = new JulianDate(2017, 2, 27);
		for (int i = 0; i < 3; i++) {
		 j7 = j7.plus(1);
		 System.out.println(j7 + "\t" + j7.getYear() + "\t" + j7.getMonth() +
		 "\t" + j7.getDay());
		 }
	}
}