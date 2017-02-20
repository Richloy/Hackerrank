import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile{

    public static void main(String[] args) {
        int lineNum = 1;
        Scanner sc = new Scanner(System.in);
		
        while(sc.hasNext()){
            System.out.println(lineNum + " " + sc.nextLine());
            lineNum++;
        }
    }
}