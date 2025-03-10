// brute force solution with exponential time complexity O(2^n), recursive solution (GH)
class Solution {
  public int fib(int n) {
      if (n <= 1) {
          return n;
      }
     return fib(n-1) + fib(n-2);
  }
}


//efficient solution using memoization O(n), space complexity O(n), dynamic programming(GH)

class Solution {
  private int[] f;
  private int fib_(int n) {
      if (n <= 1) return n;
      if (f[n] == 0) {
          f[n] = fib_(n-1) + fib_(n-2);
      }
      return f[n];
  }
  public int fib(int n) {
      f = new int[n + 1];
      return fib_(n);
  }
}



// Iterative approach from LC (Time complexity O(n), Space complexity O(1))

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        while (n-- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}


//Another dynamic programming solution from LC

class Solution 
{
    int[] fib_cache = new int[31];
	
	public int fib(int N)
    {
        if(N <= 1)
            return N;
        else if(fib_cache[N] != 0)
            return fib_cache[N];
		else 
            return fib_cache[N] = fib(N - 1) + fib(N - 2);
    }
}
