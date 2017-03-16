import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day0_Weighted_Mean {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int numerator = 0;
		int denominator = 0;
		int run = 2;
		int[] X = new int[N];
		int[] W = new int[N];
		while (run > 0){
			for (int i = 0; i < N; i++){
				if (run == 2){
					X[i] = sc.nextInt();
				} else {
					W[i] = sc.nextInt();
				}
			}
			run--;
		}
		sc.close();
		for (int i = 0; i < N; i++){
			numerator += X[i]*W[i];
			denominator += W[i];
			
		}
		System.out.printf("%.1f\n",(double)numerator/denominator);
    }
}