/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

import java.util.*;
import java.lang.Math.*;

public class PE10{

	public static void main(String[] args){
		int[] primes = new int[1000000];		//possible list of primes
		for(int i = 0; i<primes.length; i++){
			primes[i] = 0;
		}
		primes[0] = 2;
		int arrayi = 1;	//array index (where the next prime will go)
		long total = 2;	//the sum of all values of the array
		
		System.out.println("filled primes array round 1");
		boolean isPrime = true;
		for(int i = 3; i<2000000; i=i+2){	//goes through to 2 million to check if a number is prime
		
			for(int j = 0; (isPrime == true) && (j<arrayi); j++){	//if it is divisible by any of the other primes, it is not prime
				if(i%primes[j] == 0){
					isPrime = false;
				}
			}
			
			if(isPrime){	//add it to the list of primes, and increment as necessary
				
				primes[arrayi] = i;
				arrayi++;
				total = total + i;
				
				System.out.println("Got: " +  i + "new total = " + total);
			}
			isPrime = true;			
		}

		System.out.println("total: " + total);	//answer
		return;
	}
}