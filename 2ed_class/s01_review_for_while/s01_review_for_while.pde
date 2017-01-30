void setup() {
  // + - * / %
  //float + - * / NOT modulo
  //unary - +
  float z=3;
  println(-z/(z+1));
  // a += b; a -= b; a *= b; a /= b;
  int x=0;
  while (x<10) {
    print(x);
    x +=1;
  }
  println();
  x=0;
  while(x<=10){
  print(x,"");
  x++;
  }
  int y = 3;
  y *= 2 + 1;
  int a=1, b=2, c=3, d=4;
  a += b *= c -= d;
  println();
  for (int i = 0; i < 10; i++){
    print(i);
    print(" ");
  }
  println();
  for (int i = 1; i < 100; i*=2){
    print(i);
    print(" ");
  }
  println();
  for (int i = 100; i > 0; i /= 3 + 1){
    print(i);
    print(" ");
  }
  do {
    
  }while(x<10);
  exit();
}