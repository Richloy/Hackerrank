import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_Quartiles {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] myArray = new int[N];
		int[] Q1Array;
		int[] Q2Array;
		for(int i = 0; i < N; i++){
			myArray[i] = sc.nextInt();
		}
		Arrays.sort(myArray);
		Q1Array = new int[N/2];
		Q2Array = new int[N/2];
		if(N%2 == 0) {
			for(int i = 0; i < N/2; i++){
				Q1Array[i] = myArray[i];
				Q2Array[i] = myArray[N/2+i];
			}
		} else {
			for(int i = 0; i < N/2; i++){
				Q1Array[i] = myArray[i];
				Q2Array[i] = myArray[N/2+i+1];
			}
		}
		
		System.out.println(median(Q1Array));
		System.out.println(median(myArray));
		System.out.println(median(Q2Array));	
    }
	
	private static int median(int[] arr) {
		
		int mid = arr.length/2;
		if(arr.length%2 == 0){
			return (arr[mid]+arr[mid-1])/2;
		} else {
			return arr[mid];
		}
	}
}