public class PE6{
	public static void main(String[] args){
		int limit = 100;
		//sum of squares;
		int sumOfNums = 0;
		int sqOfSum = 0;
		int sumOfSqNums = 0;
		
		for(int i =1; i<=limit; i++){
			sumOfNums += i;
			sumOfSqNums += (i*i);
		}
		
		sqOfSum = sumOfNums *sumOfNums;
		
		System.out.println(sqOfSum - sumOfSqNums);
		return;
		
	}
}