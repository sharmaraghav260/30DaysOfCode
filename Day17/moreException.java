import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    int power(int x, int y) throws Exception{
        if(x < 0 || y < 0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(x,y);
        }
    }
}
