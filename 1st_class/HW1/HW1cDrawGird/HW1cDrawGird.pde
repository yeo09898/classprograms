void setup() {
  size(1920,1080);
}
long n=1;
void mouseClicked() {
   n=n+1;
   println(n);
}
void draw() {
  background(255);
  for (long x = 0L; x < n+1; x=x+1) {
   line(x*(width/n), 0, x*(width/n), height); 
   line(0, x*(height/n), width, x*(height/n));
  }
  
}