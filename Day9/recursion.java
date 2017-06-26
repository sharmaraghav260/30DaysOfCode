import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int n){
        if(n>1)
            return n*factorial(n-1);
        else
            return n;
    }
}
