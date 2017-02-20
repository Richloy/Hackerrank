import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5_Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int ans = 0;
		for(int i = 1; i <= 10; i++){
			ans = n*i;
			System.out.printf("%d x %d = %d\n", n, i, ans);
		}
    }
}
