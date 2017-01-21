void setup() {
  size(700,700);
}

void draw() {
  for (int x = 0;x < width; x = x + 100) {
   line(x, 0, x, height);
   line(0, x, height, x);
  }
  
}