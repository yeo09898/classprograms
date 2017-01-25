void setup() {
  float sum1 = 0;
  float sum2 = 0;
  float diff = 0;
  for(float n=1;n<101;n++){
  sum1 = sum1 + (1/n);
  }
  print(sum1);
  println();
  for(float n=100;n > 0; n--){
  sum2 = sum2 + (1/n);
  }
  print(sum2);
  println();
  print(diff=sum1-sum2);

}