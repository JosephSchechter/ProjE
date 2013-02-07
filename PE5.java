//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
import java.util.*;
import java.lang.Integer;

public class PE5{
	public static void main(String[] args){
		for(int i= 20*19; i<Integer.MAX_VALUE; i++){
			boolean goodnum = true;
			for(int j = 20; j>0; j--){
				if(i%j != 0){
					goodnum = false;
				}
			}
			if(goodnum == true){
				System.out.println("number is: " +  i);
				return;
			}
		//	else{
			//	goodnum = ;
		//	}
		}
		System.out.println("unable to find, exiting");
		return;
	}
}
/*
public class PE5{
	public static void main(String[] args){
//		ArrayList<Int> noDoubles = new ArrayList(); 
//		System.out.println("Initial size of al: " + noDoubles.size()); 
		int result = 1;
		for(int i = 2; i<=20; i++){
			if(i*2 <= 20){
			}
			else{
				//noDoubles.add(i);
				result = result * i;
			}
		}
//		System.out.println("contents of noDoubles: " + noDoubles);
		System.out.println(result);
		return;
		
	}
}
*/