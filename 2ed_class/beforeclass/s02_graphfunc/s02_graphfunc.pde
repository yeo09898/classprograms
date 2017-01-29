void setup() {
 size(1920,1080); 
}

void draw() {
  translate(width/2, height/2);
  scale(width/2 /3,-height/2 /50);
  //point(0,0);
  strokeWeight(0);
  float dx = (3.0 - -3)/width;
  for (float x = -3.0; x<= 3.0; x += dx) {
    float y = x * x; //Math.pow()
    point(x,y);
    //line(x,y,x,0);
  }
}