float sum(float n) {
  if (n==0) {
    println("error");
    return 0;
  } else 
  {
    float sum=0.0;
    for (float i=1.0; i<=n; i++) {
      sum=sum+1/(i*i);
    }
    return sum;
  }
}
float sum2(float n) {
  //if (n==1) {
  //return 1;
  //} else { return 1/(n*n)+sum2(n);
  float sum=0.0;
  for (float i=n; i>=1; i--) {
    sum=sum+1/(i*i);
  }
  return sum;
}
//}
void setup() {
  for (float i=1.0; i<=10000; i*=10) {
    println(sum(i));
  }
  for (float i=1.0; i<=10000; i*=10) {
    println(sum(i)*6);
  }
  for (float i=1.0; i<=10000; i*=10) {
    println(sum2(i));
  }
  for (float i=1.0; i<=10000; i*=10) {
    println(sum2(i)*6);
  }
  exit();
}