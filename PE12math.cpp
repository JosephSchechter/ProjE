/*The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
*/
#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

long long num_divisors(long long n){
	if(n%2 == 0){
		n = n/2;
	}
	long long divisors = 1; //itself
	long long count = 0;
	while(n%2 == 0){
		count++;
		n = n/2;
	}
	divisors = divisors * (count + 1);
	long long p = 3;
	while(n != 1){
		count = 0;
		while (n%p == 0){
			count++;
			n = n/p;
		}
		divisors = divisors * (count +1);
		p = p+2;
	}
	return divisors;
	
}

int main(){

	long long n = 1;
	long long lnum = num_divisors(n);
	long long rnum = num_divisors(n+1);
	while(lnum * rnum < 500){
		n++;
		lnum = num_divisors(n);
		rnum = num_divisors(n+1);
	}
	
	cout << "n has a value of: " << n << endl;
	cout << "result is: " << (n*(n+1))/2 << endl;
	
	return 0;
}