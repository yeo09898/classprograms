void setup() {
  size(1920, 1080);
}

int n = 4;
void mouseClicked() {
  n++;
}
void draw() {
  background(255);
  float cx = width/2, cy = height/2;
  float r = 500;
  for (int i = 1; i <= n; i++) {
    float theta= 2* PI /n*i;
    for (int j=i+1; j<=n; j++) {
      float theta2=2*PI/n*j ;
      float x1=cx+r*cos(theta);
      float y1=cy+r*sin(theta);
      float x2=cx+r*cos(theta2);
      float y2=cy+r*sin(theta2);
      //print(theta);
      line(x1, y1, x2, y2);
      x1 = x2;
      y1 = y2;
    }
  }
}