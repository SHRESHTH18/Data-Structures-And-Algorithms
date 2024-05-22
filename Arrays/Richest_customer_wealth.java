package class5Arrays.Assignment1.day1;
//https://leetcode.com/problems/richest-customer-wealth/
import java.util.Scanner;
import java.util.Arrays;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number of rows");
        int m=input.nextInt();
        System.out.println("enter number of columns");
        int n=input.nextInt();
        System.out.println("enter elements of the matrix");
        int[][] accounts=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                accounts[i][j]=input.nextInt();
            }
        }
        int max=maximumWealth(accounts);
        System.out.println(max);
    }

    public static int maximumWealth(int[][] accounts) {
        int sum;
        int max_sum=0;
        int m=accounts.length;
        for(int i=0;i<m;i++){;
            sum=0;
            int n=accounts[i].length;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(sum>max_sum){
                max_sum=sum;
            }
        }
        return max_sum;
    }
}
