import java.io.*;
import java.util.*;

public class JavaAnagrams {
	
	static boolean isAnagram(String a, String b) {
		
		if(a.length() != b.length()) {
			return false;
		}
		
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] charArrayA = a.toCharArray();
		char[] charArrayB = b.toCharArray();
		
		
		for(int i = 0; i < charArrayA.length; i++){
			for(int j = 0; j < charArrayB.length; j++){
				
				if(charArrayA[i] == charArrayB[j]){
					charArrayA[i] = ' ';
					charArrayB[j] = ' ';
					continue;
				}
			}
		}
		
		String newA = new String(charArrayA);
		String newB = new String(charArrayB);
		
		if(newA.equals(newB)){
			return true;
		}else{
			return false;
		}
    }
	
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}	
	
	