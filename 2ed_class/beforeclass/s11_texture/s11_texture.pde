/*
 * Rotating Globe in OpenGL: spherewith map texture
 * @author Dov Kruger
 * @created 2014-02-01
 * (c)2014 Ad Astra Education
 * Permission granted to use for non-commercial educational purposes
 * provided this comment is left intact
*/

PShape ball;
void setup() {
  size(900,700, OPENGL);
  noStroke();
  PImage img = loadImage("mars.jpg");
  sphereDetail(100);
  ball = createShape(SPHERE, 240);
  ball.setTexture(img);
   // the large this number, the better the approximation to a sphere
}

float angle = 0;
void draw(){
  background(0);  //draw the black of space
  lights();       //enable lighting
  translate(width/2,height/2); //move to the center
  rotateY(angle); //rotate the earth
  shape(ball);    //draw the earth
  angle += 0.001;  //compute the next angle
  
}