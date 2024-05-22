package class5Arrays.Assignment1.day1;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
import java.util.Scanner;
import java.util.ArrayList;

public class Kids_With_Greatest_Number_Of_Candies {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Boolean> arr=new ArrayList<>();
        System.out.println("extra candies:");
        int extra=input.nextInt();
        System.out.println("enter n");
        int n=input.nextInt();
        int [] candies=new int [n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            candies[i]=input.nextInt();
        }
        arr=kidsWithCandies(candies,extra);
        System.out.println(arr);
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr=new ArrayList<>();
        int max=0;
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }

        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }

        }
        return arr;
    }
}
