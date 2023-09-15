import java.util.Scanner;

public class baekjoon_1018 {
	
	static String right_W_board[] = {"WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW"};
	static String right_B_board[] = {"BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB","BWBWBWBW","WBWBWBWB"};
	static Scanner scan = new Scanner(System.in);	
	static String chess[]; // 입력된 체스판
	
	public static void main(String[] args)  {
		
		int input_N = scan.nextInt();// 행y
		int input_M = scan.nextInt();// 열x
		
		int min = 100;
		chess = input_board(input_N);
		
		for(int y = 0; y <=input_N-8; y++){
			for (int x = 0; x<=input_M-8; x++){
				min = min <= solved(x,y) ? min : solved(x,y);
			}
		}

		System.out.println(min);
	}
	
	public static String[] input_board(int n){ // 행 : n , 열 : m
		
		String[] board = new String[n];

		for (int i = 0 ; i < n; i++){
			board[i] = scan.next();
		}
	
		return board;
	}	
	
public static int solved(int x, int y){  // x = 열 , y = 행     
	
		int B_count = 0;
		int W_count = 0;
		
		for(int j = 0 ; j < 8 ; j++){ // y
				for (int i = 0; i < 8 ; i++){  // x
						W_count +=	chess[j+y].charAt(i+x) == right_W_board[j].charAt(i) ? 0 : 1;
						B_count +=	chess[j+y].charAt(i+x) == right_B_board[j].charAt(i) ? 0 : 1;
				}
		}
		if(W_count < B_count){
			return W_count;
		}else{
			return B_count;
		}
	}
}