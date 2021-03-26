package Algorithms.Medium;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TraverseGraph {
    public static boolean findPath(int[][] matrix){
        //we treat 0 as a deadend, and 1 as viable
        //we traverse through the graph until we reach the end. If we need to just get *a* path, let's just use DFS
        //BFS will give us the shortest path
        boolean isTraversible = false;
        Stack<int[]> toVisit = new Stack<>();
        int[] currentlyVisiting = new int[]{0,0};
        toVisit.add(currentlyVisiting);

        while(!toVisit.isEmpty()){
            isTraversible = depthFirstSearch(matrix, toVisit, currentlyVisiting);
        }

        return isTraversible;
    }


    private static boolean depthFirstSearch(int[][] matrix, Stack<int[]> toVisit, int[] currentlyVisiting){

        if(currentlyVisiting[0] == matrix.length - 1 && currentlyVisiting[1] == matrix[0].length - 1){return true;}
        //set the currently visited cell to -1 to denote we've been there
        matrix[currentlyVisiting[0]][currentlyVisiting[1]] = -1;
        //look at the next cell
        currentlyVisiting = toVisit.pop();
        System.out.println("Visiting: " + currentlyVisiting[0] + ", " + currentlyVisiting[1]);

        //add everything around currentlyVisiting to the toVisit variable
        int[][] neighbors = new int[4][2];
        //left
        neighbors[0] = new int[]{currentlyVisiting[0] - 1, currentlyVisiting[1]};
        //right
        neighbors[1] = new int[]{currentlyVisiting[0] + 1, currentlyVisiting[1]};
        //up
        neighbors[2] = new int[]{currentlyVisiting[0], currentlyVisiting[1] - 1};
        //down
        neighbors[3] = new int[]{currentlyVisiting[0], currentlyVisiting[1] + 1};
        if(currentlyVisiting[0] >= 1 && matrix[currentlyVisiting[0] - 1][currentlyVisiting[1]] != -1 && matrix[currentlyVisiting[0] - 1][currentlyVisiting[1]] != 0){toVisit.add(neighbors[0]);}
        if(currentlyVisiting[0] < matrix[0].length - 1 && matrix[currentlyVisiting[0] + 1][currentlyVisiting[1]] != -1 && matrix[currentlyVisiting[0] + 1][currentlyVisiting[1]] != 0){toVisit.add(neighbors[1]);}
        if(currentlyVisiting[1] >= 1 && matrix[currentlyVisiting[0]][currentlyVisiting[1] - 1] != -1 && matrix[currentlyVisiting[0]][currentlyVisiting[1] - 1] != 0){toVisit.add(neighbors[2]);}
        if(currentlyVisiting[1] < matrix.length - 1 && matrix[currentlyVisiting[0]][currentlyVisiting[1] + 1] != -1 && matrix[currentlyVisiting[0]][currentlyVisiting[1] + 1] != 0){toVisit.add(neighbors[3]);}

        if(toVisit.isEmpty()){return false;}
        return depthFirstSearch(matrix, toVisit, currentlyVisiting);
    }

    public static void main(String[] args) {
        int[][] mat={{1,0,0,0},{1,1,0,0},{0,1,1,0},{1,1,1,1}};
        System.out.println(findPath(mat));
    }

}
