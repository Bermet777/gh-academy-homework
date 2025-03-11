//recursive solution GH O(log n) time complexity
class Solution {
  public double myPow(double x, int n) {
      long exponent = (long) n;
      if (exponent < 0) {
          exponent = - exponent;
          x = 1 / x;
      }
      return myPow_(x, exponent);
  }
  private double myPow_(double x, long exponent) {
      if (exponent == 0) return 1;
      return (exponent % 2 == 0) ? myPow_(x * x, exponent / 2)
                                 : myPow_(x * x, exponent / 2) * x;         
  }
}


//iterative approach LC solution (time is still O(log(n)) but space is O(1)

class Solution {
  public double myPow(double x, int n) {
      if( n < 0) {
          n = -n;
          x = 1 / x;
      }
      double pow = 1;
      while (n != 0) {
          if((n & 1) != 0) {
              pow = pow * x;
          }
          x = x * x;
          n >>>= 1;
      }
      return pow;
  }
}