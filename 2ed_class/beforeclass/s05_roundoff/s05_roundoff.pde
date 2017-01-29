/*
  In decimal 1/10 = 0.1 "nice"
  1/2 = 0.5
  1/3 = 0.33333333
  computer floating point is binary
  1/2 1/4 1/8 1/16 ...
  
  
1.95
 .00858
 .00997
-----------
1.95
 .00997
-----------
1.95

1.95
 .00858
 .00997
----------
 .0185
1.95
----------
1.96

a + b = b + a commutative
a + b + c = a + (b + c) associative

70.0000xxxx

70.0001xxxx
---------
 0.00010
 
 
 (x - 1.000001)(x - 1.0)
 
 x^2 - 2.000001x + 1.000001 will not work in computer 
 
 
*/
void setup() {
 for (float i = 1; i <= 10; i += .1)
   print(i,"");
 exit();
}