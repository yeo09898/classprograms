PShape earth;
PShape moon;
void setup() {
  size(2000,1000,P3D);
  PImage img=loadImage("earth4k.jpg");
  PImage img2=loadImage("moon.jpg");
  noStroke();
  sphereDetail(50);
  earth= createShape(SPHERE,500);
  earth.setTexture(img);
  moon=createShape(SPHERE,200);
  moon.setTexture(img2);
}

float z=0;
float erot=0;
float mrot=0;
float earthorbit=0;
float moonorbit=0;
void draw() {
   background(0);
   translate(width/2,height/2,-2000);
   pushMatrix();
   //rotateY(earthorbit);
   //translate(400,0);
   //rotateY(-earthorbit);
   rotateY(erot);
   shape(earth);
   popMatrix();
   rotateY(moonorbit);
   translate(1500,0);
   rotateY(-moonorbit);
   rotateY(mrot);
   shape(moon);
   erot += .01;
   mrot += .005;
   earthorbit +=.005;
   moonorbit +=.005;
  }