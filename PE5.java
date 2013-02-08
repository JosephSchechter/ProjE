//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
import java.util.*;
import java.lang.Integer;

public class PE5{
	public static void main(String[] args){
		for(int i= 20*19; i<Integer.MAX_VALUE; i++){	//will go through all integers until it reaches an answer
			boolean goodnum = true;	//if it is the right number
			for(int j = 20; (goodnum == true) && (j>0); j--){	//goes through from 20 to 1 and tests if it is divisible, if not, it is not a goodnum, move on
				if(i%j != 0){
					goodnum = false;
				}
			}
			if(goodnum == true){
				System.out.println("number is: " +  i);	//answer
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
