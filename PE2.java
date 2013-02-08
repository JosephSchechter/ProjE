//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
class PE2{
	public static void main(String[] args){
		int fib1 = 1;	//1st 2 fibonacci numbers 1, 2 (exclude the 1st 1 in a 1,1,2 sequence)
		int fib2 = 2;
		int result= 2;	//so far 2 is the only even-valued
		int newFib = 0;
		
		while(newFib < 4000000){
			newFib = fib1 + fib2;	//the next fib number is the sum of the previous 2
			if(newFib < 4000000){	//if not past limit, continue
				if(newFib % 2 == 0){	//if it is even, add it to the result
					result = result + newFib;
				}
			}
			fib1 = fib2;	//shift the values down
			fib2 = newFib;	
		}
		System.out.println(result);//answer
		return;
		
	}
}