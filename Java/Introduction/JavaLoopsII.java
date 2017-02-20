import java.util.*;
import java.io.*;

public class JavaLoopsII{
	
    public static void main(String []argh){
		
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
		
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int total = 0;
			
            for (int j=0;j<n;j++){
                int power = (int)Math.pow(2,j)*b;
				
                if (j == 0){
                    total = a+power;
                }else{
                    total = total + power;
                }
                
				System.out.print(total);
                System.out.print(" ");
            }
            System.out.println("");
        }
        in.close();
        
    }
}
