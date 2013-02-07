import java.util.*;

public class PE4{


	private static boolean isPal(int n){
		int temp = n;
		LinkedList myList = new LinkedList();
		while(temp> 0){
			myList.add(temp%10);
			temp = temp/10;
		}
		
		for(int i = 0; i<myList.size()/2; i++){
			if(myList.get(i) != myList.get(myList.size() - i - 1)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		//most # of digits is 6 aka /100,000
		int largest = 0;
		
		for(int i = 100; i<=999; i++){
			for(int j = 100; j<= 999; j++){
				int mynum = i*j;
				if(isPal(mynum)){
					if(mynum > largest){
						largest = mynum;
					}
				}
			}
		}
		
		System.out.println(largest);
		return;
	}
}