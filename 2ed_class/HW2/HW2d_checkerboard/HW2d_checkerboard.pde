void setup() {
  size(800, 800);
}
int n;
int[] x=new int[100],y=new int[100];
void mouseClicked(){
  x[n]=(mouseX/100)*100+50;
  y[n]=(mouseY/100)*100+50;
  n++;
}
void draw() {
  background(0);
  fill(255);
  for (int z = 0, y = 0; y < height; y += 100) {
    z -= 100;
    for (int x = z; x < width; x += 200) {
      rect(x, y, 100, 100);
    }
  }
  for (int i=0;i<n;i++){
    fill(255/**((i%2+1)%2)*/,/*255*((i%2)%2)*/+0,0);
    ellipse(x[i],y[i],100,100);
  }
}