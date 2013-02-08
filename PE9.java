/*
A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,

a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class PE9{
	public static void main(String[] args){
		int c = 1;
		int a = 1;
		int b = 1;
		
		//brute force method to check all values from 1-1000 if they meet the 2 conditions a+b+c==1000 abd c^2 == a^2 + b^2
		for(c=1; c<998; c++){
			for(b=1; b<998; b++){
				for(a=1;a<998; a++){
					if(a+b+c == 1000){
						if(c*c == a*a + b*b){
							System.out.println("answer = " + a*b*c);
							return;
						}
					}
				}
			}
		}
		return;
		
	}
}