//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
class PE2{
	public static void main(String[] args){
		int result= 2;
		int fib1 = 1;
		int fib2 = 2;
		int newFib = 0;
		
		while(newFib < 4000000){
			newFib = fib1 + fib2;
			if(newFib < 4000000){
				if(newFib % 2 == 0){
					result = result + newFib;
				}
			}
			fib1 = fib2;
			fib2 = newFib;			
		}
		System.out.println(result);
		return;
		
	}
}