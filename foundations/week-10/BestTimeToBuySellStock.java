package foundations.week-10;
//Version 1
class Solution {
  public int maxProfit(int[] prices) {
      if (prices.length==0) {
          return 0;
      } 
      int min_price = prices[0];
      int max_profit = 0;
      for (int i=0; i < prices.length; i++) {
          if (prices[i] < min_price) {
              min_price = prices[i];
          }
          int curr_profit = prices[i] - min_price;
          if (curr_profit > max_profit) {
              max_profit = curr_profit;
          }
      }
      return max_profit;
  }
}

//Version 2
class Solution {
  public int maxProfit(int[] prices) {
      int min_price = prices[0];
      int max_profit = 0;
      for (int i=1; i < prices.length; i++ ){
          if (prices[i] < min_price){
              min_price = prices[i];
          } else if (prices[i] - min_price > max_profit) {
              max_profit = prices[i] - min_price;
          }
      }
    return max_profit;
  }
}

//Version 3
class Solution {
  public int maxProfit(int[] prices) {
    int min_price = prices[0];
    int max_profit = 0;
    for (int i : prices) {
        max_profit = Math.max(max_profit, i - min_price);
        min_price = Math.min(min_price, i);
        }
    return max_profit;
    }
}