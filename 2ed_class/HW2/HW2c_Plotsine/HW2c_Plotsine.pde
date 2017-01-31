void setup(){
 size(800,600); 
}

void draw(){
  translate(width/2,height/2);
  float x=-2*PI,fx=0,x2=-2*PI,fx2=0;
  //scale(width/(4*PI),-height/(2));
  for(float i=-2*PI;i<2*PI;i+=.001){
    //noStroke();
    x=i;
    fx=sin(i);
    line(x*width/(2*PI),fx*height/2,x2*width/(2*PI),fx2*height/2);
    x2=x;
    fx2=fx;
  }
}