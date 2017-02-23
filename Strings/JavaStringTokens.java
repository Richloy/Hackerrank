import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tokens = s.trim().split("[ !,?._'@]+",0);
		if(tokens.length == 1 && tokens[0].equals("")){
			System.out.println(0);
		}else{
			System.out.println(tokens.length);
			for(int i = 0; i < tokens.length; i++){
				System.out.println(tokens[i]);
			}
		}
        scan.close();
    }
}
