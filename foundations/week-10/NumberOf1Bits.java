class Solution {
  public int hammingWeight(int n) {
      String bstring = Integer.toBinaryString(n);
          int count = 0; 
          for (int i=0; i < 31; i++) {
              int bitmask = 1 << i;
              if ((n & bitmask) > 0) {
                  count++;
              }
          }
      return count;    
  }
}