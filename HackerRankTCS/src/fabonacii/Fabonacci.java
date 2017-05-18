package fabonacii;

import java.math.BigInteger;
import java.util.Scanner;
public class Fabonacci {
    
    public static void fibonacci(int n) {
      
          BigInteger a = new BigInteger("1");
          BigInteger b = new BigInteger("0");
          BigInteger nextNumber= new BigInteger("0");
    	
    	/*long a=0;
    	long b=1;
    	long nextNumber=1;*/
    	//System.out.print(a+" ");
          for (int i = 0; i < n; i++) {
        	  BigInteger nextNumber_int=nextNumber;
              System.out.print(nextNumber_int + " ");
              nextNumber = a.add(b);
              a = b;
              b = nextNumber;
          }
      }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      if(n==0){
    	 System.out.println("n should not be 0");
      }
      else{
      fibonacci(n);
      }
       }
}