/*
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.
 */

package class5Arrays.Assignment1;
import java.util.Scanner;
public class Minimum_Cost_to_move_chips_to_same_position {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = in.nextInt();
        int position[] = new int[n];
        System.out.println("enter array");
        for (int i = 0; i < n; i++) {
            position[i] = in.nextInt();
        }
        int evencount=0;
        int oddcount=0;
        //counting the number of coins on even position and odd position
        for (int i = 0; i < position.length; i++) {
            if(position[i]%2==0) evencount++;
            else oddcount++;
        }
        //there will be no cost for even position to shift to another even position and same for odd positions
        //the less the conversions ,from odd to even or even to odd ,the less will be the cost
        //therefore we find the minimum of even count and odd count
        System.out.println(Math.min(evencount,oddcount));

    }
}
