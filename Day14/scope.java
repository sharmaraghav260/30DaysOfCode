import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  private int[] elements;
  public int maximumDifference;
  // Add your code here
  Difference(int[] array){
      this.elements = array;
  }

  public void computeDifference() {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for ( int i : elements ) {
          min = Math.min( min, i);
          max = Math.max( max, i);
      }
      maximumDifference = max-min;
  }
} // End of Difference class
