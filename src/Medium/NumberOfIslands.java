package Medium;

// solution for https://leetcode.com/problems/number-of-islands/

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    numIslands(grid, i, j);
                }
            }
        }
        return count;
    }
    public void numIslands(char[][] grid, int i, int j) {
        grid[i][j] = 0;
        if (i > 0 && grid[i - 1][j] == '1') numIslands(grid, i - 1, j);
        if (j > 0 && grid[i][j - 1] == '1') numIslands(grid, i, j - 1);
        if (i < grid.length - 1 && grid[i + 1][j] == '1') numIslands(grid, i + 1, j);
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1') numIslands(grid, i, j + 1);
    }
}

/* Test Cases
[["1","1","1"],["0","1","0"],["1","1","1"]]
[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]
[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]
[["1"]]
[[]]
[["1","1","1","1","1"],["1","1","1","1","1"],["1","1","1","1","1"],["1","1","1","1","1"]]
[["0","0","0","0","0"],["0","0","0","0","0"],["0","0","0","0","0"],["0","0","0","0","0"]]
[["1","0","1","0","0"],["0","1","0","0","0"],["1","0","1","0","0"],["0","1","0","0","1"]]
 */