package palindrome;
import java.io.*;
import java.util.*;

public class Solution {
public static boolean isBitSet(int num, int index){
		return (num & (1<<(index-1)))!=0;
	}
	
	public static boolean isPalindrome (int num){
		int numOfBits = (int) (Math.floor( ( Math.log( num )/Math.log(2)) ) + 1);
		  int left = 0;
		  int right = numOfBits - 1; 
		  while( left < right ){
		    if( isBitSet( num, numOfBits - left ) != isBitSet( num, numOfBits-right )  ) {
		      return false;
		    }
		    left++;
		    right--;
		  }
		  return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String s=Boolean.toString(Solution.isPalindrome(num));
		System.out.println(s.toUpperCase());
	}
}