package interviews;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class OracleHacker {

    static int countIslands(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == 1 && !visited[r][c]) {
                    dfs(matrix, r, c, visited);
                    ++count;
                }
            }
        }
        return count;
    }

    static void dfs(int[][] matrix, int r, int c, boolean[][] visited) {
        int[] rPos = {-1, 1, 0, 0};
        int[] cPos = { 0, 0, -1, 1};

        visited[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int newR = r + rPos[i];
            int newC = c + cPos[i];

            if (inRange(matrix, newR, newC, visited)) {
                dfs(matrix, newR, newC, visited);
            }
        }
    }

    static boolean inRange(int[][] matrix, int r, int c, boolean[][] visited) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        return (r >= 0 ) && (r < rows) && (c >= 0) && (c < cols) && (matrix[r][c] == 1 && !visited[r][c]);
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int a;
        // a = in.nextInt();
        // int b;
        // b = in.nextInt();
        // int sum;

        // sum = addNumbers(a, b);
        // System.out.println(sum);
        int[][] matrix1 = {
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}
        };
        int[][] matrix2 = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };
        int[][] matrix3 = {
                {1,1,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,1,1,1}
        };
        System.out.println(countIslands(matrix1));
        System.out.println(countIslands(matrix2));
        System.out.println(countIslands(matrix3));
    }
}


// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1

// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3
