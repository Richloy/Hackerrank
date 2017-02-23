import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10_Binary_Numbers {

    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String bin = Integer.toBinaryString(n);
        int max = 0;
        int score = 0;
        for(int i = 0; i < bin.length(); i++){
			
            if(bin.charAt(i) == '1'){
				
                score++;
				if(max < score){
					max = score;
				}
            }else{
                score = 0;
            }
        }
        System.out.println(max);
    }
}