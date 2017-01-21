void setup() {
  size(600,600);
}

int x = 0, y = 0, dx = 2, dy = 0, dz = 0;
void draw() {
  background(255);
  stroke(0,255,255);
  fill(255,255,0);
  final int RECT_WIDTH = 50, RECT_HEIGHT= 50;
  rect(x,y,RECT_WIDTH,RECT_HEIGHT);
  x = x + dx;
  y = y + dy;
 
  if (x >width-RECT_WIDTH ) {
    x =width-RECT_WIDTH;
    dz = dx;
    dx = dy;
    dy = dz;
  }
  if (y >height-RECT_HEIGHT ) {
    y =height-RECT_HEIGHT;
    dz = dy;
    dy = dx;
    dx = -dz;
  }
  if (x < 0) {
    x = 0;
    dz = dx;
    dx = dy;
    dy = dz;
  }
  if (y < 0) {
    y = 0; 
    dz = dy;
    dy = dx;
    dx = -dz;
  }
}