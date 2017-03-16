import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int x = 99;
		for(int i = 1; i <= n; i++){
			for(int j = n-i; j > 0; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++){
				System.out.print("#");				
			}
			System.out.println();
		}
    }
}
