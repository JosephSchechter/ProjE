//Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

//TO RUN: java PE13 < PE13.txt

import java.io.*;
import java.math.BigInteger;

public class PE13{
	public static void main(String[] args){
		//list of 100 integers that will be converted from strings
		String[] myList = new String[100];
		BigInteger[] myBig  = new BigInteger[100];
		BigInteger total = BigInteger.valueOf(0);
		
		/*
		FileInputStream fstream = new FileInputStream("PE13.txt");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(in);
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//reading from input
		
		
		for(int i = 0; i<100; i++){
			//get line from text file
			try{
			myList[i] = br.readLine();
			System.out.println("Just read string: " + myList[i]);
			} catch(IOException e){
				System.out.println("Error");
				System.exit(1);
			}
			
			//convert to BigInteger
			myBig[i] = new BigInteger(myList[i]);
			System.out.println("Just Converted String to: " + myBig[i]);
			
			//add to total;
			total = total.add(myBig[i]);
			System.out.println("total: " + total);
		}
		
		//getting to below/equal to  9,999,999,999 (top 10 digits)
		BigInteger limit = new BigInteger("9999999999");
		while(total.compareTo(limit) == 1){	
		//while total > 9999999999, divide by 10 to get to the top 10 digits
			System.out.println("partial total: " + total);
			total = total.divide(BigInteger.valueOf(10));			
		}
		System.out.println("answer: " + total);
		return;
	}
}