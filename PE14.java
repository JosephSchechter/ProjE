/*
The following iterative sequence is defined for the set of positive integers:

n  n/2 (n is even)
n  3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13  40  20  10  5  16  8  4  2  1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.


I will use a MAP to memoize this
*/

import java.lang.*;
import java.util.*;
import java.math.BigInteger;

public class PE14{

	public static HashMap<BigInteger, Integer> getLength(BigInteger n, HashMap<BigInteger, Integer> hm){	//this returns an updated hashmap of the memoized lengths
		System.out.println("getting length "+ n);
		if(hm.containsKey(n)){//if it exists on the hashmapped value yet for this number
			return (hm);
		}
		else{ //not on the map yet
			if(n.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))){	//even
				HashMap<BigInteger, Integer> temp = getLength(evenJump(n), hm);//gets updated map of even jump
				temp.put(n, temp.get(evenJump(n)) + 1);	//adds 1 to the even jump's answer			
				return temp;
			}
			else{	//odd
				HashMap<BigInteger, Integer> temp = getLength(oddJump(n), hm);//gets updated map of even jump
				temp.put(n, temp.get(oddJump(n)) + 1);	//adds 1 to the even jump's answer			
				return temp;
			}
		}
	}
	public static BigInteger oddJump(BigInteger n){
		return (n.multiply(BigInteger.valueOf(3)).add(BigInteger.valueOf(1)));
	}
	public static BigInteger evenJump(BigInteger n){
		return (n.divide(BigInteger.valueOf(2)));
	}
	public static void main(String[] args){
		HashMap<BigInteger, Integer> cache = new HashMap<BigInteger, Integer>();
		cache.put(BigInteger.valueOf(1), 1);
		cache.put(BigInteger.valueOf(2), 2);
		cache.put(BigInteger.valueOf(-1), 2); //-1 is the temp
		
		Integer largest = 2;
		BigInteger num = BigInteger.valueOf(2);
		
		for(int i = 3; i<1000000; i = i + 2){
			//	if it is in the map, get the length and test
			if(cache.containsKey(BigInteger.valueOf(i))){
				if(largest < cache.get(BigInteger.valueOf(i))){
					largest = cache.get(BigInteger.valueOf(i));
					num = BigInteger.valueOf(i);
				}
			}
			//not in the map yet
			else{
				cache = getLength(BigInteger.valueOf(i), cache);
				if(largest < cache.get(BigInteger.valueOf(i))){
					largest = cache.get(BigInteger.valueOf(i));
					num = BigInteger.valueOf(i);
				}
			}
			
			System.out.println(i + ": largest length so far = " + largest);
			
		}
		
		System.out.println("ANSWER: " + largest + " by: " + num);//answer
	}
}