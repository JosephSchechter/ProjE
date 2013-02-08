/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/

public class PE3Try2{
	//tests if a long is prime by dividing it by numbers other than 1 and itself, and if it finds a divisor, it is not prime
	private static boolean isPrime(long n){
		for(long i = 2L; i<n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		long limit = 600851475143L;	//need a long since the number is so large
		long answer = 0;
		for(long i = 2L; i<limit; i++){	//tests up to the limit for prime divisors of limit
			if(isPrime(i)){	//is prime
				while(limit%i == 0){	//is a divisor
					System.out.println("dividing " + limit + " by " + i);	//if it is divisible by that number i, then you can break the number into prime factors and disregard i in your future source, making the limit smaller, eventually leaving the last and largest prime factor as the limit
					limit = limit/i;
					answer = limit;
				}
			}
		}
		
		System.out.println(answer);
		return;		
	}
}