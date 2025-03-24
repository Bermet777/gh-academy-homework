//package algorithms.week_20;
//Time complexity: O(4^n / √n) - This is the Catalan number growth rate
//Space complexity: O(n) for the recursion stack depth
import java.util.ArrayList;
import java.util.List;
class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }
        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }
        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
    public static void main (String[] args) {
      GenerateParentheses solution = new GenerateParentheses();
      int n = 3;
      List<String> result = solution.generateParenthesis(n);
      System.out.println("All valid parenthesis combinations for n=" + n + ":");
        for (String s : result) {
          System.out.println(s);
        }
      System.out.println("Total: " + result.size() + " combinations");
    }
}

