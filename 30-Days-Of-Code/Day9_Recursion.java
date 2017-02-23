import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9_Recursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.print(factorial(N));
    }
    
    public static int factorial(int N){
        
        if(N > 1){
            return N*(factorial(N-1));        
        }else{
            return 1;
        }
    }
}