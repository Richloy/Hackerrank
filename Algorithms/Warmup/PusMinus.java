import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PusMinus {

    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
		int minus = 0;
		int plus = 0;
		int zero = 0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
			if(arr[arr_i] > 0){
				plus++;
			} else if(arr[arr_i] < 0){
				minus++;
			} else {
				zero++;
			}
        }
		System.out.printf("%.6f\n", (double)plus/n);
		System.out.printf("%.6f\n", (double)minus/n);
		System.out.printf("%.6f\n", (double)zero/n);
    }
}
