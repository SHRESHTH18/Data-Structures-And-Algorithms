//Given an m x n matrix, return all elements of the matrix in spiral order.

package class5Arrays.Assignment1;
import java.util.Scanner;
import java.util.ArrayList;
public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no. of rows");
        int m=in.nextInt();
        System.out.println("enter no. of columns");
        int n=in.nextInt();
        int[][] matrix=new int[m][n];
        System.out.println("enter array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        int a=0;
        while(list.size()!=m*n){
            //first row
            for(int i=a;i<n-a;i++){
                list.add(matrix[a][i]);
            }
            //last column
            for(int j=a+1;j<m-a;j++){
                list.add(matrix[j][n-a-1]);
            }
            //last row
            for(int i=n-a-2;i>a;i--){
                list.add(matrix[m-a-1][i]);
            }
            //first column
            for(int j=m-a-1;j>a;j--){
                list.add(matrix[j][a]);
            }
            a++;
        }
        System.out.println(list);

    }

}
