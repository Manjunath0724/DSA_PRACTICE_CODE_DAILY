package leetcode;

import java.util.List;

public class lt_3248 {

    public int finalPositionOfSnake(int n, List<String> commands) {

        int row = 0;
        int col = 0;

        for (String cmd : commands) {
            if (cmd.equals("UP")) {
                row--;
            } else if (cmd.equals("DOWN")) {
                row++;
            } else if (cmd.equals("LEFT")) {
                col--;
            }

            else {
                col++;
            }
        }
        return row * n + col;
    }

public static void main(String[] args) {
    lt_3248 s = new lt_3248();
    List<String> commands = List.of("UP", "UP", "LEFT", "DOWN", "RIGHT");
    int n = 3;
    int result = s.finalPositionOfSnake(n, commands);
    System.out.println(result); // Output: 1
}
