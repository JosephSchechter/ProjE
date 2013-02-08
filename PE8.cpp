// Find the greatest product of five consecutive digits in the 1000-digit number.
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
//#include <fstream>
using namespace std;


int main(){
	//a buffer of 5 numbers that it will read at a time as characters
	int buffer[5] = {0,0,0,0,0};
	char temp [1] = {'a'};
	
	int maxVal = 0;	//answer
	do{	//reads in 1 character at a time from input
		cin >> temp[0];
		
		for(int i = 0; i<4; i++){	//shifts numbers up 1 in the buffer to make room for the newly read number
			buffer[i] = buffer[i+1];
		}
		buffer[4] = atoi(temp);
		
		int mult = buffer[0] * buffer[1] * buffer[2] * buffer[3] * buffer[4];
		
		if(mult > maxVal){	//if that buffer's multiplied value is greatest
			maxVal = mult;
		}
	} while(temp[0] != '$');	//i added a endchar ($) to the file
	cout << "maxVal: \n" << maxVal;
	return 0;
}
