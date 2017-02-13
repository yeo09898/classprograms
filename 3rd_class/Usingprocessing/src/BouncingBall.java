import processing.core.PApplet;

public class BouncingBall extends PApplet {
	
	
	public void settings() {
		size(1920,1080);
		
	}
	private float x = 0, y = 0;
	private float dx = 2*PI, dy = 7.5F;
	public void draw() {
		  background(175);
		  fill(100,255,100);
		  stroke(175,255,0);
		  ellipse(x + 50,y + 50, 100, 100);
		  x = x + dx; 
		  y= y + dy; //x++; x +=1; ++x;
		  if (x >= width - 100 || x < 0 ){
		  dx = -dx;
		  }
		  if (y >= height - 100 || y < 0) {
		  dy = -dy;}
	}

	public static void main(String[] args) {
		 PApplet.main("BouncingBall");
	}
}