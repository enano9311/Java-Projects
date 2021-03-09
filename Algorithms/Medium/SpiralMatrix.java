package Algorithms.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralMatrix(int[][] mat){
        List<Integer> spiral = new ArrayList<>();

        if(mat == null || mat.length == 0){return spiral;}

        int top = 0;
        int bottom = mat.length - 1;
        int right = mat[0].length - 1;
        int left = 0;
        int size = mat.length * mat[0].length;

        while(spiral.size() < size){
            for(int i = left; i <= right; i++){
                if(spiral.size() < size){
                    spiral.add(mat[top][i]);
                }
            }
            top++;

            for(int j = top; j <= bottom ; j ++){

                if(spiral.size() < size){
                    spiral.add(mat[j][right]);
                }
            }
            right--;

            for(int i = right; i >= left; i--){

                if(spiral.size() < size){
                    spiral.add(mat[bottom][i]);
                }
            }
            bottom --;

            for(int j = bottom; j >= top; j --){

                if(spiral.size() < size){
                    spiral.add(mat[j][left]);
                }
            }
            left ++;

        }
        return spiral;
    }
}
