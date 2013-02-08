//What is the 10 001st prime number?
import java.util.*;

public class PE7{
	public static void main(String[] args){
		//made a linked list of integers
		LinkedList<Integer> myList = new LinkedList();
		myList.add(2);
		myList.add(3);
		
		for(int i = 5; i<Integer.MAX_VALUE; i=i+2){
			int ALSize = myList.size();
			
			boolean isPrime = true;
			//while the number is not proved to not be a prime, go through the list and see if it has any divisors in the list, if not, it is prime
			for(int j = 0; (isPrime == true) && (j<ALSize); j++){		
				int temp = myList.get(j);
				if(i%temp == 0){//not prime
					isPrime = false;
				}
			}
			
			if(isPrime){//if it is prime, add it to the list
				myList.add(i);
				System.out.println("added: " + i + " size: " + myList.size());
			}
			
			if(myList.size() == 10001){	//size we want
				System.out.println(myList.get(10000));	//number we want, 10001st prime
				return;
			}
			
		}
		
		return;
	}
	
}