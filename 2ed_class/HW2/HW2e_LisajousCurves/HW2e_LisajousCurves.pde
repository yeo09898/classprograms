void setup() {
  size(1000, 1000);
}

int a=13, b=15;
float t, dt=.001;
float x1, y1, x2=cos(a*t), y2=cos(b*t);
void draw() {
  translate(width/2, height/2);
  //scale(width/2,height/2);
  for (t=0; t<=(2*PI); t=t+dt) {
    x1=cos(a*t);
    y1=cos(b*t);
    line(x1*width/2, y1*height/2, x2*width/2, y2*height/2);
    x2=x1;
    y2=y1;
  }
}