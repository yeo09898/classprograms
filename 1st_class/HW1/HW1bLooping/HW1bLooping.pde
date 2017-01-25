void setup() {
  for (int i = 0; i < 10; i++) {
    print(i);
    println();
  }
  for (int i = 1; i < 100; i= i + 2) {
  print(i,"");
  }
  println();
  for (int a = 1; a < 40000; a = 2 * a) {
  print(a,"");
  }
  exit();
}