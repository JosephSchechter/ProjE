/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
*/
import java.util.*;
import java.lang.Math.*;
import java.math.*;

public class PE16{
	public static void main(String[] args){
//		double num = Math.pow(2,1000);
		BigInteger bi = BigInteger.valueOf(2);
		BigInteger num = bi.pow(1000);
		System.out.println("whole number: " + num);
		BigInteger ten = BigInteger.valueOf(10);
		
		
		String numString = num.toString();
		int len = numString.length();
		char c;
		int total = 0;
		for(int i = 0; i<len; i++){
			c = numString.charAt(i);
			System.out.println("number: " + (c-48));
			total = total + (c-48);
		}
		
		/*
		
		int total  = 0;
		while(num.intValue() != 0){
			System.out.println(num.remainder(ten).intValue());
			total = num.remainder(ten).intValue() + total;
			num = num.divide(ten);
		}
		*/
		System.out.println("ANSWER: " + total);
		
		return;
	}
}