public class PE1{
	public static void main(String[] args){
		const int limit = 1000;
		int size3 = (limit-1)/3;
		int size5 = (limit -1)/5;
		int size15 = (limit-1)/15;
		
		int[] my3s = new int[size3];
		int[] my5s =  new int[size5];
		int[] my15s = new int(size15);
		
		boolean done = false;
		int num = 3;
		int i = 0;
		while(!done){
			my3s[i] = num;
			num = num+3;
			i++;
			if(num>= limit){
				done = true;
			}
		}
		
		num = 5;
		i = 0;
		done = false;
		while(!done){
			my5s[i] = num;
			num = num+5;
			i++;
			if(num>= limit){
				done = true;
			}
		}
		
		int finalSize = size3+size5-size15;
		int[] result = new int[finalSize];
		
		
	}
}