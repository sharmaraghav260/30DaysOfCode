import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int n[] = new int[num];

    for (int j=0; j<num; j++){
      n[j] = sc.nextInt();
      boolean divisible = false;
      if(n[j] == 1)
        divisible = true;

      for(int i=2; i<=n[j]/i; i++){
        if(n[j]%i == 0){
          divisible = true;
          break;
        }
      }
      if(divisible)
        System.out.println("Not prime");
      else
        System.out.println("Prime");
    }
  }
}
