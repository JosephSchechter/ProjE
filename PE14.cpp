/*
The following iterative sequence is defined for the set of positive integers:

n  n/2 (n is even)
n  3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13  40  20  10  5  16  8  4  2  1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

*/


#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

long long lengths[3000001];	//the lengths are the known chain lengths for the corresponding index being the number. This is a memoization technique that will capture many, but not all of the possible values needed, it is improved in the java version of my solution that uses a hashmap

//returns the new n after it is determined to be an odd number 
long long oddEqn(long long n){
	return (3*n+1);
}
//returns the new n after it is determined to be an even number 
long long evenEqn(long long n){
	return (n/2);
}

//this updates the memoization structure as well as returns the length of the chain starting from a number n
long long getLength(long long n){
	cout << "getting length " << n << endl;
	if(n>= 3000001){
		if(n%2 == 0){
			return (1+ getLength(evenEqn(n)));
		}
		else{//n is odd
			return (1 + getLength(oddEqn(n)));
		}
	}
	
	
	else{	//number is in range of the list
		if(lengths[n] != 0){//already marked on the list
			return lengths[n];
		}
		else{	//not on the list but between 3000001 and 1
			if(n%2 == 0){
				long long ans = 1 + getLength(evenEqn(n));
				lengths[n] = ans;
				return (ans);
			}
			else{//n is odd
				long long ans = 1 + getLength(oddEqn(n));
				lengths[n] = ans;
				return (ans);
			}		
		}
		
	}
}

int main(){
	for(long long i = 1; i<3000001; i++){
		lengths[i] = 0;
	}
//	lengths[0] = -1;
	lengths[1] = 1;
	lengths[2] = 2;
	
	long long maxlength = 2;		//longest known chain length
	long long templength = 0;
	long long tempval = 0;
	
	//goes through 3 - 1000000 getting the length of the chain, and if it is the longest so far, it updates the maxlength, and it will try and store a length for a value that it meets and the value is below 3000001
	for(long long i = 3; i < 1000000; i++){
		cout << "I = " << i << endl;
		templength = getLength(i);
		cout << "$ i's length = " << templength << endl;
		if(templength > maxlength){
			tempval = i;
			maxlength = templength;
		}
	}
	
	cout << "max length: " << maxlength;
	cout<< "from value: " << tempval;


	return 0;

}

