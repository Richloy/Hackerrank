import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_Interquartile_Range {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] F = new int[N];
		int[] Q1Array;
		int[] Q2Array;
		int totalF = 0;
		for(int i = 0; i < N; i++){
			X[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++){
			F[i] = sc.nextInt();
			totalF += F[i];
		}
		
		// Create and populate full array
		int populate = 0;
		int[] wholeArray = new int[totalF];
		while(populate < totalF){
			for(int i = 0; i < N; i++){
				for(int j= 0; j < F[i]; j++){
					wholeArray[populate] = X[i];
					populate++;		
				}
			}
		}
		Arrays.sort(wholeArray);
		
		// Divide array in two
		Q1Array = new int[totalF/2];
		Q2Array = new int[totalF/2];
		if(totalF%2 == 0) {
			for(int i = 0; i < totalF/2; i++){
				Q1Array[i] = wholeArray[i];
				Q2Array[i] = wholeArray[totalF/2+i];
			}
		} else {
			for(int i = 0; i < totalF/2; i++){
				Q1Array[i] = wholeArray[i];
				Q2Array[i] = wholeArray[totalF/2+i+1];
			}
		}
		System.out.printf("%.1f", median(Q2Array)-median(Q1Array));
    }
	
	private static double median(int[] arr) {
		
		int mid = arr.length/2;
		if(arr.length%2 == 0){
			return (double)(arr[mid]+arr[mid-1])/2;
		} else {
			return (double)arr[mid];
		}
    }
}