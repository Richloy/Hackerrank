import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_Standard_Deviation {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		double[] meanDist = new double[N];
		int total = 0;
		double totalDist = 0.0;
		for(int i = 0; i < N; i++){
			X[i] = sc.nextInt();
		}
		
		// Calculate mean
		for(int element : X){
			total += element;
		}
		double mean = (double)total/N;
		
		// Calculate Squqre of Distances from mean
		for(int i = 0; i < N; i++){
			meanDist[i] = Math.pow(X[i]-mean, 2);
		}
		
		// Calculate the sum of Squqre Distances
		for(double element : meanDist){
			totalDist += element;
		}
		
		//Print Standard Deviation to one decimal place 
		System.out.printf("%.1f", Math.sqrt(totalDist/N));	
    }
}