package Algorithms.Medium;

public class NumIslands {
    public static int numIslands(int[][] grid){
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        if(grid == null || grid.length == 0) return islands;

        for(int j = 0; j < rows; j++){
            for(int i = 0; i < cols; i++){
                if(grid[i][j] == 1){
                    islands += dfs(grid, i ,j);
                }
            }
        }
        return islands;
    }

    private static int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= grid[0].length || j < 0 || j >= grid.length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;

        int left = dfs(grid, i - 1, j);
        int right = dfs(grid, i + 1, j);
        int up = dfs(grid, i, j - 1);
        int down = dfs(grid, i, j + 1);

        return 1;
    }
}
