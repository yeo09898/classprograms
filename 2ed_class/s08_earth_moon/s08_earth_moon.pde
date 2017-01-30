PShape earth;
PShape moon;
PShape sun;
void setup() {
  size(2000,1000,P3D);
  PImage img=loadImage("earth4k.jpg");
  PImage img2=loadImage("moon.jpg");
  PImage img3=loadImage("mars.jpg");
  noStroke();
  sphereDetail(100);
  earth= createShape(SPHERE,100);
  earth.setTexture(img);
  moon=createShape(SPHERE,20);
  moon.setTexture(img2);
  sun= createShape(SPHERE,1000);
  sun.setTexture(img3);
}

float z=0;
float erot=0, mrot=0, srot=0;
float earthorbit=0, moonorbit=0;
void draw() {
   background(0);
   translate(width/2,height/2,-5000);
   pushMatrix();
   translate(3000,0);
   pushMatrix();
   //rotateY(earthorbit);
   //translate(400,0);
   //rotateY(-earthorbit);
   rotateY(erot);
   shape(earth);
   popMatrix();
   rotateY(moonorbit);
   translate(200,0);
   rotateY(-moonorbit);
   rotateY(mrot);
   shape(moon);
   popMatrix();
   rotateY(srot);
   shape(sun);
   erot += .01;
   mrot += .005;
   earthorbit +=.005;
   moonorbit +=.005;
   srot += .001;
  }