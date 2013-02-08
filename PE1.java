/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/

//PE-1-(3 and 5)-easy solution, goes throughall 1000 numbers and checks if it is divisible by 3 or 5 and adds it to a running tally
public class PE1{
	public static void main(String[] args){
		int limit = 1000;
		
		int finalAnswer = 0;//tally
		
		for(int i =1; i<limit; i++){
			if(i%5 == 0 || i%3 == 0){	//divisible by 3 or 5
				finalAnswer = finalAnswer + i;	//add it to the final tally
			}
		}
		
		
		System.out.println(finalAnswer);	//answer
		return;
	}
}