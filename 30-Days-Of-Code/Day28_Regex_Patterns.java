import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day28_Regex_Patterns {

    public static void main(String[] args) {
		
		String emailReg = ".+@gmail\\.com";
		Pattern pattern = Pattern.compile(emailReg);
		List<String> list = new ArrayList<String>();
		
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
			
			Matcher match = pattern.matcher(emailID);
			while(match.find()) {
				list.add(firstName);
			}
        }
		Collections.sort(list);
		for(String element : list) System.out.println(element);
    }
}
