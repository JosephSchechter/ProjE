//What is the 10 001st prime number?
import java.util.*;

public class PE7{
	public static void main(String[] args){
		LinkedList<Integer> myList = new LinkedList();
		myList.add(2);
		myList.add(3);
		
		for(int i = 5; i<Integer.MAX_VALUE; i=i+2){
			int ALSize = myList.size();
			
			boolean isPrime = true;
			for(int j = 0; (isPrime == true) && (j<ALSize); j++){
				int temp = myList.get(j);
				if(i%temp == 0){//not prime
					isPrime = false;
				}
			}
			
			if(isPrime){
				myList.add(i);
				System.out.println("added: " + i + " size: " + myList.size());
			}
			
			if(myList.size() == 10001){
				System.out.println(myList.get(10000));
				return;
			}
			
		}
		
		return;
	}
	
}