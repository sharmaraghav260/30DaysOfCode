import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 1; i<=num; i++){
            String even="";
            String odd="";
            String str = sc.next();
            for(int j = 0; j< str.length(); j++){
                if(j%2 == 0)
                    even += str.charAt(j);
                else
                    odd += str.charAt(j);
            }
            System.out.println(even + " " + odd);
        }
    }
}
