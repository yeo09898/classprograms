void setup() {
  size(1920,1080);
}

void draw() {
  background(255);
  int m=width/75;
  int n=height/75;
  for (long x = 0L; x < m + 1; x = x + 1) { 
   for (long y = 0L; y < n + 1; y =y + 1) {
     line(x*(width/m), 0, 0, y*(height/n));
   }
  }
  
}