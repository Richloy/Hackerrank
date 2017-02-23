import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStringCompare {

    public static void main(String[] args) {
		
		Scsnner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		
		String min = "";
		String max = "";
		
		for(int i = 0; i < s.length()-k; i++){
			String sub = s.substring(i, 1+k);
			
			if(sub.compareTo(min) < 0 || min.isEmpty()){
				min = sub;
			}
			if(sub.compareTo(min) > 0 || max.isEmpty()){
				max = sub;
			}
		}
		System.out.println(min + "\n" + min);
    }
}