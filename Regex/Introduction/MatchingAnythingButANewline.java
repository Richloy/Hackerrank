import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchingAnythingButANewline {    

    public static void main(String[] args) {
        
        Tester tester = new Tester();
        tester.checker("(...\\.){3}..."); // or ...\\....\\....\\....
    
    }
}

class Tester {

    public void checker(String pattern){
    
        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(Test_String);
        boolean match = m.matches();
        System.out.format("%s", match);
    }   
    
}