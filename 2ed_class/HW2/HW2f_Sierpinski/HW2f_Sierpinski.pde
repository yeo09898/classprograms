void setup() {
  size(800, 800);
  println("Click the mouse!!");
}

void sierpinski(float x1, float y1, 
  float x2, float y2, 
  float x3, float y3, int level) {
  if (level == 0) {
    triangle(x1, y1, x2, y2, x3, y3);//draw a tirangle
    return;
  }
  sierpinski(x1, y1, (x1+x2)/2, (y1+y2)/2, (x1+x3)/2, (y1+y3)/2, level-1);
  sierpinski((x1+x2)/2, (y1+y2)/2, x2, y2, (x2+x3)/2, (y2+y3)/2, level-1);
  sierpinski((x1+x3)/2, (y1+y3)/2, (x2+x3)/2, (y2+y3)/2, x3, y3, level-1);
}
int n=0;
void mouseClicked() {
  n++;
  println(n);
}
void draw() {
  background(255);
  fill(0);
  if (n<=10) {
    sierpinski(0, height-1, width/2, 0, width-1, height-1, n);
  } else {
    print("n is too large to display!");
    exit();
  }
}