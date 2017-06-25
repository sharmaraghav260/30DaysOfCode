import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] rev = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            rev[n-1-i] = arr[i];
        }
        for(int i=0; i < n; i++){
            System.out.print(rev[i]+" ");
        }

        in.close();
    }
}
