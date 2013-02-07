// Find the greatest product of five consecutive digits in the 1000-digit number.
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
//#include <fstream>
using namespace std;


int main(){
	int buffer[5] = {0,0,0,0,0};
	char temp [1] = {'a'};
	
	int maxVal = 0;
	do{
		cin >> temp[0];
		
		for(int i = 0; i<4; i++){
			buffer[i] = buffer[i+1];
		}
		buffer[4] = atoi(temp);
		
		int mult = buffer[0] * buffer[1] * buffer[2] * buffer[3] * buffer[4];
		
		if(mult > maxVal){
			maxVal = mult;
		}
	} while(temp[0] != '$');
	cout << "maxVal: \n" << maxVal;
	return 0;
}
