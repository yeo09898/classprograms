void setup() {
  size(800, 800);
  }
void draw() {
  background(255);
  fill(0);
  for (int z = 0,y = 0; y < height; y += 100) {
    z -= 100;
    for(int x = z; x < width; x += 200) {
      rect(x, y, 100, 100);
    }
  }
}