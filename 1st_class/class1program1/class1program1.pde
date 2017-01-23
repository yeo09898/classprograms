void setup() {
  size(800,500);
  //frameRate(60);
}

int x = 0, y = 0;
int dx = 2, dy = 2;
//int is 32 bit +/- 31 bit = 2.1 billion 
void draw() {
  background(255,255,0);
  fill( 255, 0, 0);
  rect( x, y, 100, 100);
  fill(0,0,255);
  stroke(0,255,0);
  ellipse(x + 50,y + 50, 100, 100);
  x = x + dx; 
  y= y + dy; //x++; x +=1; ++x;
  if (x >= width - 100 || x < 0 ){
  dx = -dx;
  }
  if (y >= height - 100 || y < 0) {
  dy = -dy;
  }
  //rect(x,y+300,100,100);
  
  
}