package New;

import java.util.Scanner;


public class TiaTacToe {

	public static  int row, col;
	public static char turn = 'X';
	public static Scanner scan = new Scanner(System.in);
	public static char [][] board;
	
	public static void main (String[] args) {
		board = new char[3][3];
		for(int i = 0; i < 3; i++) {
			for(int a = 0; a < 3; a++) {
				board[i][a] = '_';
				
				
			}
		}
		Play();
		
	}
	
	public static void Play() {
		
		boolean playing = true;
		
		PrintBoard();
		while (playing) {
			System.out.println("Please enter a row and column: ");
			row = scan.nextInt() - 1;
			col = scan.nextInt() - 1;
			board[row][col] = turn;
			if(GameOver(row,col)) {
				playing = false;
				
				System.out.println("Game over! Player " + turn + " wins!");
			}
			
			PrintBoard();
			if (turn == 'X')
				turn = 'O';
			else
				turn = 'X';
			
				
	
	}
	}
	

	
	
	public static void PrintBoard() {
		for(int i = 0; i < 3; i++) {
			System.out.println();
			for(int a = 0; a < 3; a++) {
				if(a == 0)
					System.out.print("| ");
				System.out.print(board[i][a] + " | ");
	}
	}
	}
	
	
	public static boolean GameOver(int aMove, int bMove) {
		// Perpendicular
		if(board[0][bMove] == board[1][bMove] && board[0][bMove] == board[2][bMove])
				return true;
		if(board[aMove][0] == board[aMove][1] && board[aMove][0] == board[aMove][2])
				return true;
		
		// Diagonal
		if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_')
				return true;
		if(board[0][2] == board[1][1] && board[0][2] == board[2][2] && board[1][1] != '_')
				return true;
		
		return false;
		
		
	}
}
