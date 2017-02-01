import
  ddf.minim.*;
Minim minim;         
AudioPlayer player;//please install Minim library in Tool menu
PShape earth;
PShape moon;
PImage img3;
void setup() {
  size(1366, 768, P3D);
  PImage img=loadImage("earth4k.jpg");
  PImage img2=loadImage("moon.jpg");
  img3=loadImage("space1366.jpg");
  minim = new
    Minim(this);
  player = minim.loadFile("star.mp3");
  player.play(); 
  noStroke();
  sphereDetail(100);
  earth= createShape(SPHERE, 637.8/2);
  earth.setTexture(img);
  moon=createShape(SPHERE, 173.7/2);
  moon.setTexture(img2);
}

float z=0;
float erot=0, mrot=0;
float earthorbit=0, moonorbit=0;
float i=160;
float d=0;
void draw() {
  background(img3);
  translate(width/2, height/2, -i);
  pushMatrix();
  rotateY(erot);
  shape(earth);
  popMatrix();
  rotateY(moonorbit);
  translate(3500/2, 0);
  //rotateY(-moonorbit);
  rotateY(mrot);
  shape(moon);
  erot += .0285;
  mrot += .001;
  //earthorbit +=.005;
  moonorbit +=.001;
  rotateX(d);
  d+=.5;
  if (i<=2000) {
    i+=2;
  } else {
    if (i>=1000) {
      i-=1;
    } else {
      if (i>=1500) {
        i-=.6;
      } else {
        if (i>=1700) {
          i-=.2;
        } else {
          if (i>=2000) {
            i-=.2;
          }
        }
      }
    }
  }
}