void setup() {
  size(1920,1080);
  //frameRate(20);
}

float[] x =new float[1000], y = new float[1000], dx = new float[1000], dy = new float[1000];
//int is 32 bit +/- 31 bit = 2.1 billion 
int n=0;
void mouseClicked() {
   n=n+1;
   println(n);
   x[n]=random(50,width-50);
   y[n]=random(50,height-50);
   dx[n]=random(-3,3);
   dy[n]=random(-3,3);
}
void draw() {
  //background(0);
  //fill( 255, 0, 0);
  //rect( x, y, 100, 100);
  fill(0,0,0,10);
  rect(0,0,width,height);
  for(int i = 1; i <= n; i++){
  stroke(255,0,0);
  fill(0,255,100);
  ellipse(x[i],y[i], 100, 100);
  x[i] = x[i] + dx[i]; 
  y[i]= y[i] + dy[i]; //x++; x +=1; ++x;
  if (x[i] >= width - 50 || x[i] < 50 ){
  dx[i] = -dx[i];
  }
  if (y[i] >= height - 50 || y[i] < 50) {
  dy[i] = -dy[i];
  }
  //rect(x,y+300,100,100);
  
  }
}