/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 x  99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.util.*;

public class PE4{

	//tests if a number is a palindrome by making a list of the digits and testing if the first and last are the same, 2nd and list-1 are the same,...etc
	private static boolean isPal(int n){
		int temp = n;
		LinkedList myList = new LinkedList();
		while(temp> 0){	//break up the digits by modding by 10, then divide by 10 to move to next number
			myList.add(temp%10);
			temp = temp/10;
		}
		
		for(int i = 0; i<myList.size()/2; i++){//go through half the list and test 1st and last, 2nd last -1, 3rd last-2, etc
			if(myList.get(i) != myList.get(myList.size() - i - 1)){	//if they are not the same in anything, not a palindrome
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		//most # of digits is 6 aka /100,000
		int largest = 0;
		//multiply all 3 digit numbers togeather, and test them if they are a palindrome, then compare the palindrome numbers
		for(int i = 100; i<=999; i++){
			for(int j = 100; j<= 999; j++){
				int mynum = i*j;
				if(isPal(mynum)){	
					if(mynum > largest){	//largest palindrome
						largest = mynum;
					}
				}
			}
		}
		
		System.out.println(largest);	//answer
		return;
	}
}