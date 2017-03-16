import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
		
		long[] myArray = new long[5];
		long total = 0;
		long sum = 0;
		long max = 0;
		long mini = 0;
        Scanner in = new Scanner(System.in);
		for(int i = 0; i < myArray.length; i++){
			myArray[i] = in.nextLong();
			total += myArray[i];
		}
		in.close();
		for(int i = 0; i < myArray.length; i++){
			sum = total - myArray[i];
			if(sum > max || max == 0){
				max = sum;
			}
			if(sum < mini || mini == 0){
				mini = sum;
			}			
		}
		System.out.println(mini+" "+max);
    }
}
