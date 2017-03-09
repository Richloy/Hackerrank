import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26_Nested_Logic {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retDay = sc.nextInt();
		int retMth = sc.nextInt();
		int retYear = sc.nextInt();
		int exDay = sc.nextInt();
		int exMth = sc.nextInt();
		int exYear = sc.nextInt();
		int fine = 0;
        
		if (retYear > exYear){
			fine = 10000;
		} else {
			if (retMth > exMth){
				fine = (retMth - exMth) * 500;
			} else {
				if (retDay > exDay){
					fine = (retDay - exDay) * 15;
                }
			}
		}
        System.out.println(fine);
    }
}
