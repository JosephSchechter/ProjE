//Find the sum of the digits in the number 100!

import java.io.*;
import java.math.BigInteger;
import java.lang.*;


public class PE20{
	public static BigInteger Factorial(BigInteger n){
			if(n.equals(BigInteger.valueOf(2))){
				return BigInteger.valueOf(2);//2! = 2
			}
			else{
				return n.multiply(Factorial(n.subtract(BigInteger.valueOf(1)))); //return n*(n-1)!
			}
	}
	
	public static void main(String[] args){
		BigInteger num = Factorial(BigInteger.valueOf(100));
		System.out.println("100! = " + num);
		
		String str = num.toString();
		int total = 0;
		
		for(int i = 0; i<str.length(); i++){
			total = total + (str.charAt(i) - '0');
		}
		System.out.println("Total:\n" + total + "\n");
		
		return;
	}
}