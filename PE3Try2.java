public class PE3Try2{

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
		for(long i = 2L; i<limit; i++){
			if(isPrime(i)){
				while(limit%i == 0){
					System.out.println("dividing " + limit + " by " + i);
					limit = limit/i;
					answer = limit;
				}
			}
		}
		
		System.out.println(answer);
		return;		
	}
}