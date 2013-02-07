public class PE3{

	private static boolean isPrime(long n){
		for(long i = 2L; i<n; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args){
		long limit = 600851475143L;
		
		long answer = 0;
		
		for(long i = 3L; i<= limit; i = i+2){
			if(isPrime(i)){
				answer = i;
			}
		}
		System.out.println(answer);
		return;		
	}
}