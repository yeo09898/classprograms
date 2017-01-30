void setup() {
  int a = 2 + 3 * 4;
  int b = a / 3 * 4;
  int c = a % 3 * 4;
  println(b, c);
  float x=sin(c)+sin(2*c)/2+
    sin(3*c)/3;
  int n=5;
  if (n%2!=0) {
    println("odd");
  } else {
    println("even");
  }
  if (3 < 3) {
    println("Yes");
    println("Maybe");
  } else {
    println("No!");
    println("way");
  }
  exit();
}