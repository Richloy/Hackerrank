import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day29_Bitwise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            
            int n = in.nextInt();
            int k = in.nextInt();
            int max = 0;

            for(int j = 1; j < n; j++){
                for(int l = j+1; l <= n; l++){
                    int h = j & l;
                    if(h < k && max < h){
                        max = h;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
