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


int main(){
	//create list of triangle numbers  and get number of divisors of that tNum
	long long longestNumDivisors = 1;	//longest number of divisors
	long long ans = 1;
	long long num = 1;
	long long tNum = 0;
	while(longestNumDivisors < 500){
		//get tNum from num
		tNum = tNum + num;
		/*
		for(long long i = 1; i<= num; i++){
			tNum += i;
		}
		*/
		
		cout << "tNum = " << tNum << endl;
		
		long long numDivisors = 1; //(itself)
		for(long long i = 1; i<= (tNum/2); i++){
			if(tNum%i == 0){
				numDivisors++;
			}
		}
		
		cout << "numDivisors = " << numDivisors << endl;
		
		if(numDivisors>longestNumDivisors){
			longestNumDivisors = numDivisors;
			ans = tNum;
		}
		
		num++;
	}
	
	cout << "the first tNum with > 500 divisors is: " << ans << " with " << longestNumDivisors << endl;
	return 0;
}
