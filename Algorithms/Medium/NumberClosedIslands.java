package Algorithms.Medium;

public class NumberClosedIslands {

    public static int closedIsland(int[][] grid){
        // find land, look for all connected land. if it is an island, mark it as an island.
        int islands = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        if(grid == null || grid.length == 0){return islands;}

        for(int i = 1; i < rows - 1; i++){

            for(int j = 1; j < columns - 1; j++){

                if(grid[i][j] == 0){
                    if(isClosedIsland(grid,i,j,rows,columns)){
                        ++islands;
                    }
                }

            }

        }
        return islands;
    }

    private static boolean isClosedIsland(int[][] grid, int i, int j, int rows, int columns){

        if(grid[i][j] == 1 || grid[i][j] == -1){return true;}

        // we have land now, if it's on perimeter, return false
        if(isOnPerimeter(i,j,rows,columns)){
            return false;
        }
        grid[i][j] = -1;
        boolean left = isClosedIsland(grid, i, j - 1, rows, columns);
        boolean right = isClosedIsland(grid, i, j + 1, rows, columns);
        boolean up = isClosedIsland(grid, i - 1, j, rows, columns);
        boolean down = isClosedIsland(grid, i + 1, j, rows, columns);

        return left && right && up && down;

    }

    private static boolean isOnPerimeter(int i, int j, int rows, int columns){
        return i ==0 || j == 0 || i == rows - 1 || j == columns - 1;
    }
}
