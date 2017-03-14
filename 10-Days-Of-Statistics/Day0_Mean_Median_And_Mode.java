import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day0_Mean_Median_And_Mode {

    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		int meanTotal = 0;
		double median;
		int elementTotal = 0;
		int highestElementTotal = 0;
		int N = sc.nextInt();
		int[] myArray = new int[N];
		for (int i = 0; i < N; i++) {
			myArray[i] = sc.nextInt();
		}
		Arrays.sort(myArray);
		for (int element : myArray) meanTotal += element;
		
		double mean = (double)meanTotal/N;
		System.out.printf("%.1f\n",mean);
		
		if (N%2 == 0){
			median = (double)(myArray[N/2-1]+myArray[N/2])/2;
		} else {
		median = myArray[N/2];
		}
		System.out.printf("%.1f\n", median);
		
		int mode = myArray[0];
		for (int i = 1; i < N; i++) {
			if (myArray[i-1] == myArray[i]){
				elementTotal++;
			}else {
				if (elementTotal > highestElementTotal) {
					highestElementTotal = elementTotal;
					mode = myArray[i-1];
				}
				elementTotal = 0;					
			}	
		}
		System.out.println(mode);		
    }
}