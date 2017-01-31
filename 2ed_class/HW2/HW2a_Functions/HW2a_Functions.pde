double fact(int n) {
  if (n == 1||n == 0) {
    return 1.0;
  } else {  
    double f=1.0;
    for (int i=n; i>=1; i--) {
      f=f*i;
    }
    return f;
  }
}

double fact2(int n) {
  if (n == 1||n == 0) {
    return 1;
  } else 
  return (double)n*fact2(n-1);
}

double fibo(int n) {
  if (n==1||n==2) {
    return 1;
  } else {
    double a=1.0, b=1.0, sum=0.0;
    for (int i=2; i<n; i++) {
      sum=a+b;
      b=a;
      a=sum;
    }
    return sum;
  }
}

double fibo2(int n) {
  if (n==1||n==2) {
    return 1;
  } else {
    return fibo2(n-1)+fibo2(n-2);
  }
}
void setup() {
  for (int i=0; i<=30; i+=3) {
    print(fact(i), "");
  }
  println();
  println();
  for (int i=0; i<=30; i+=3) {
    print(fact2(i), "");
  }
  println();
  println();
  for (int i=1; i<=20; i++) {
    print(fibo(i), "");
  }
  println();
  println();
  for (int i=1; i<=20; i++) {
    print(fibo2(i), "");
  }
  exit();
}