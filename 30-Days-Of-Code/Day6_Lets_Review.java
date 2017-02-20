import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6_Lets_Review {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < T; i++){
			String S = sc.nextLine();
			for(int j = 0; j < S.length(); j += 2){
				System.out.print(S.charAt(j));
			}
			System.out.print(" ");
			for(int k = 1; k < S.length(); k += 2){
				System.out.print(S.charAt(k));
			}
			System.out.println("");
		}
    }
}