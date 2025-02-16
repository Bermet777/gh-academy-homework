class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        //Two dimensional solution
        int row = 0;
        int col = 0;
        for (String command : commands) {
            if (command.equals("UP")) {
                row--;
            }
            else if (command.equals("DOWN")) {
                row++;
            }
            else if (command.equals("RIGHT")) {
                col++;
            }
            else if (command.equals("LEFT")) {
                col--;
            }
        }
        return row * n + col;
    }
}


class Solution {
  public int finalPositionOfSnake(int n, List<String> commands) {
      //One dimensional solution
      int number = 0;
      for (String command : commands) {
          if (command.equals("UP")) {
              number -= n;
          }
           else if (command.equals("DOWN")) {
              number += n;
          }
           if (command.equals("RIGHT")) {
              number ++;
          }
           if (command.equals("LEFT")) {
              number --;
          }
      }
  return number;    
  }
}