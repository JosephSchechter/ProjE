/*
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class PE6{
	public static void main(String[] args){
		int limit = 100;
		//sum of squares;
		int sumOfNums = 0; 	//(a+b+c)
		int sqOfSum = 0;	//(a+b+c)^2
		int sumOfSqNums = 0;	//(a^2+b^2+c^2)
		
		for(int i =1; i<=limit; i++){	//goes through the 1st 100 natural numbers and adds them or adds the squares of themselves
			sumOfNums += i;
			sumOfSqNums += (i*i);
		}
		sqOfSum = sumOfNums *sumOfNums;
		
		System.out.println(sqOfSum - sumOfSqNums);//the difference between the 2 values
		return;
		
	}
}