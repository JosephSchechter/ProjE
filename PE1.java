//PE-1-(3 and 5)-easy
public class PE1{
	public static void main(String[] args){
		int limit = 1000;
		
		int finalAnswer = 0;
		
		for(int i =1; i<limit; i++){
			if(i%5 == 0 || i%3 == 0){
				finalAnswer = finalAnswer + i;
			}
		}
		
		
		System.out.println(finalAnswer);
		return;
	}
}