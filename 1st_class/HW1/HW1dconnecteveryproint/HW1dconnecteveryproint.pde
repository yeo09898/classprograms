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
  for (long x = 0L; x < n + 1; x = x + 1) { 
   for (long y = 0L; y < n + 1; y =y + 1) {
     line(x*(width/n), 0, 0, y*(height/n));
   }
  }
  
}