
public class Multithread {
	public static void main(String[] args)  {
		Thread t = new Thread() {
			public void run() {
				System.out.println("hello");
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} 
			}
		};
		t.start();
	}
}
