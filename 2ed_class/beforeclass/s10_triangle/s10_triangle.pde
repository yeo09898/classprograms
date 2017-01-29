void setup() {
  size(800,800, OPENGL);
}

void draw(){
  translate(width/2,height/2, -600);
  beginShape();
  fill(255,255,255);
  vertex(0,0,0);
  fill(0,255,0);
  vertex(500,0,0);
  fill(0,0,255);
  vertex(0,500,0);
  endShape();
  
}