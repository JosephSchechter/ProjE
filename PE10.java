/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

import java.util.*;
import java.lang.Math.*;

public class PE10{

	public static void main(String[] args){

		int[] primes = new int[1000000];
		for(int i = 0; i<primes.length; i++){
			primes[i] = 0;
		}
		primes[0] = 2;
		int arrayi = 1;
		long total = 2;
		
		System.out.println("filled primes array round 1");
		boolean isPrime = true;
		for(int i = 3; i<2000000; i=i+2){
		
			for(int j = 0; (isPrime == true) && (j<arrayi); j++){
				if(i%primes[j] == 0){
					isPrime = false;
				}
			}
			
			if(isPrime){
				
				primes[arrayi] = i;
				arrayi++;
				total = total + i;
				
				System.out.println("Got: " +  i + "new total = " + total);
			}
			isPrime = true;			
		}

		System.out.println("total: " + total);
		return;
	}
}