void setup(){
  size(1000,1000,P3D);
}

void draw(){
  background(255);
  translate(500,500,-200);
  rotate(PI/4,1,1,1);
  fill(255,0,0);
  box(300);
  fill(255,255,0);
  sphere(200);
 
}