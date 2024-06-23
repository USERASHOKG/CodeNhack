package CodeNhack.leetCode150.Array;

import java.util.*;
public class Candies{
    public static int distrubute(int[] ratings){
        int n = ratings.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Arrays.fill(left,1);
        Arrays.fill(right,1);

        int candies = 0;

        //compare from 1 to left
        for(int i=1; i<n; i++){
            if (ratings[i] > ratings[i -1]) left[i] = left[i -1]+1;
        }

        //compare from n-2 to right neighbour
        for(int i=n -2; i>=0; i--){
            if(ratings[i] > ratings[i +1]) right[i] = right[i +1]+1;
        }

        //merge 2 arrays which is haviong max values
        for(int i=0; i<n; i++){
            candies += Math.max(right[i],left[i]);
        }

        return candies;
        
    }
    public static void main(String[] args) {
        int[] ratings = {1,0,2}; // {1,2,2} = 4

        int s =distrubute(ratings);

        System.out.println(s);
        
    }
}
