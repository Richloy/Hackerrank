import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
		boolean pal = false;
		for(int i = 0; i < A.length(); i++){
			if(A.charAt(i) != A.charAt(A.length()-i-1)){
				pal = false;
				break;
			}else{
				pal = true;
			}
		}
		if(pal)System.out.println("Yes");
		if(!pal)System.out.println("No");
    }
}
