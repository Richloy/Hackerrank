import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_Data_Types {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		 /* Declare second integer, double, and String variables. */
        int iIn;
        double dIn;
        String sIn;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        iIn = scan.nextInt();
        dIn = scan.nextDouble();
        scan.nextLine();
        sIn = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + iIn);
        /* Print the sum of the double variables on a new line. */
        //DecimalFormat oneDigit = new DecimalFormat("#,##0.0");
        System.out.println(d + dIn);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        String newString = s + sIn;
        System.out.println(newString);
		scan.close();
    }
}
