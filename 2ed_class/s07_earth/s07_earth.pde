PShape earth;
void setup() {
  size(1000,1000,P3D);
  PImage img=loadImage("earth4k.jpg");
  noStroke();
  sphereDetail(50);
  earth= createShape(SPHERE,400);
  earth.setTexture(img);
}

float z=0;
float ang=0;
void draw() {
   background(0);
   translate(width/2,height/2,z);
   rotateY(ang);
  // rotateX(ang/2);
   shape(earth);
   ang += .001;
  }