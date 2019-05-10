package newcoder_30;

import java.util.ArrayList;

public class 顺时针打印矩阵_19 {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
        int up = 0,left = 0;
        int right = matrix[0].length-1,down = matrix.length-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(up<=down && left<=right){
            for(int i=left;i<=right;i++){
                res.add(matrix[up][i]);
            }
            up++;
            if(!(up<=down && left<=right))break;
            for(int i=up;i<=down;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(!(up<=down && left<=right))break;
            for(int i=right;i>=left;i--){
                res.add(matrix[down][i]);
            }
            down--;
            if(!(up<=down && left<=right))break;
            for(int i=down;i>=up;i--){
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
