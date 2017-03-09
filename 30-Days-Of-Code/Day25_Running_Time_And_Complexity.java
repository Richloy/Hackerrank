import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day25_Running_Time_And_Complexity {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean notPrime = true;
		int T = sc.nextInt();
		while (T > 0) {
			int n = sc.nextInt();
			if (n == 2){
				notPrime = false;
			}
			if (n > 2){
				for(int i = 2; i <= n/2; i++){
					notPrime = false;
					if(n%i == 0){
						notPrime = true;
						break;
					}
				}
			}
			if (notPrime) {
				System.out.println("Not prime");
			} else {
				System.out.println("Prime");
			}
			T--;
		}
    }
}
