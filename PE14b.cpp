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

//returns the new n after it is determined to be an odd number 
long long oddEqn(long long n){
	return (3*n+1);
}

//returns the new n after it is determined to be an even number 
long long evenEqn(long long n){
	return (n/2);
}

//returns the length of numbers it takes to get down to 1 from a current number n in a recursive fashion
long long getLength(long long n){
	if(n == 1){	//ithe length of the chain starting with 1 is 1
		return 1; 
	}
	//not 1
	cout << "getting length " << n << endl;
	
	//adds 1 to whatever is the length of the next number in the chain, even or odd
	if(n%2 == 0){	//n is even
		return (1+ getLength(evenEqn(n)));
	}
	else{//n is odd
		return (1+ getLength(oddEqn(n)));
	}
}

int main(){
	
	long long maxlength = 2;		//longest known chain length
	long long templength = 0;	//length of the current number being tested

	
	//going through all 1000000 numbers, starting with 3 since we know 2 and 1
	for(long long i = 3; i < 1000000; i++){
		cout << "I = " << i << endl;
		templength = getLength(i);
		cout << "$ i's length = " << templength << endl;
		if(templength > maxlength){	//new maximum
			maxlength = templength;
		}
	}
	//answer
	cout << "max length: " << maxlength;


	return 0;

}

