// to RUN: PE11 < PE11.txt 
//What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 2020 grid?

import java.io.*;

public class PE11{
	public static void main(String[] args){
		//collect numbers into 2d arrays
		//String board[][] = new String[20][20];
		int board[][] = new int[20][20];
		String tempLine = "";
		String[] tokens;
		//BufferedReader br = new BufferedReader(new InputStreamReader(in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reads in a line at a time, then parses it into 20 different numbers split by spaces
		for(int first = 0; first < 20; first++){
			try{
			tempLine = br.readLine();
			} catch (IOException e){
				System.out.println("Error");
				System.exit(1);
			}
			tokens = tempLine.split(" ");
			for(int second = 0; second < 20; second++){
				board[first][second] = Integer.parseInt(tokens[second]);
			}
		}
		
		System.out.println("made it out");
/*		checking it is correct, it is!
		for(int first = 0; first < 20; first++){
			for(int second = 0; second < 20; second++){
				System.out.print(board[first][second] + "\t");
			}
			System.out.println("");
		}
*/

		int largestMutliple = 0;
		
		//If we go from [0][0] to [0][19] and then down [1][0] and across again, we only have to look for 4 down, 4 to the right, 4 down/diag/right and 4 up/diag/right
		for(int first = 0; first < 20; first++){
			for(int second = 0; second < 20; second++){
				//check this and 3 right below it
				if(first <= 16){ //has 3 below it
					if((board[first][second] * board[first+1][second] * board[first+2][second] * board[first+3][second]) > largestMutliple){
						largestMutliple = board[first][second] * board[first+1][second] * board[first+2][second] * board[first+3][second];
					}
					
					//check this and 3 down/diag/right
					if(second <= 16){ //has 3 below, and 3 to the right
						if((board[first][second] * board[first+1][second+1] * board[first+2][second+2] * board[first+3][second+3]) > largestMutliple){
							largestMutliple = board[first][second] * board[first+1][second+1] * board[first+2][second+2] * board[first+3][second+3];
						}
					}
					
				}
				
				//check this and 3 to the right of it
				if(second <= 16){ //has 3 to the right of it
					if((board[first][second] * board[first][second+1] * board[first][second+2] * board[first][second+3]) > largestMutliple){
						largestMutliple = board[first][second] * board[first][second+1] * board[first][second+2] * board[first][second+3];
					}
					
					//check this and 3 up/diag/right
					if(first >= 3){	//has 3 above and 3 tot he right
						if((board[first][second] * board[first-1][second+1] * board[first-2][second+2] * board[first-3][second+3]) > largestMutliple){
							largestMutliple = board[first][second] * board[first-1][second+1] * board[first-2][second+2] * board[first-3][second+3];
						}
					}
				}

			}
		}
		
		
		System.out.println("ANSWER: " + largestMutliple);
		
		return;
		
		
	}
}