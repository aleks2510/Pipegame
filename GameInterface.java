package game;

import java.util.Scanner;

public class GameInterface {
	// Variables for the class
	static int level;
	static int secureSwitch;

	public static void main(String[] args) {
		// At the beginning of the game the user will choose between 3 different
		// levels, easy, medium, and hard.
		Scanner input = new Scanner(System.in);
		System.out
				.println("Please enter the level you want to play. Press 1 to easy, 2 to select medium, and 3 to select hard");
		level = input.nextInt();
		selectLevel(level);

		input.close();
	}

	// This method selects the level.
	public static void selectLevel(int level) {
		Scanner input = new Scanner(System.in);
		boolean on = true;
		while (on == true) {
			if (level == 1) {
				on = false;
				easyLevel();
			}

			else if (level == 2) {
				mediumLevel();
				on = false;
			} else if (level == 3) {
				hardLevel();
				on = false;
			} else {
				System.out.println("Please enter a correct level");
				level = input.nextInt();
			}
		}
		input.close();
	}

	private static void mediumLevel() {
		Scanner input = new Scanner(System.in);
		int row;
		int column;
		int piece;
		System.out.println("This is the medium Level");
		MediumBoard board = new MediumBoard();
		while (board.checkCompleted() == false) {
			board.printBoard();
			if (board.checkCompleted() == false) {
				System.out
						.println("What piece do you want to add to your board?");
				row = input.nextInt();
				column = input.nextInt();
				piece = input.nextInt();
				//While the number of columns or row are bigger or equal to 5 you will have to put a real number
				
				if(row >=5 || column >=5){
					System.out.println("Please enter a real number");
					row = input.nextInt();
					column = input.nextInt();
					piece = input.nextInt();
					board.addPiece(row, column, piece);
				}
				else{				
					board.addPiece(row, column, piece);
				}
			}
		}
		board.printBoard();
		if (board.checkAnswer() == true) {
			System.out.println("You lost");
		} else {
			System.out.println("You won");
			input.close();
		}

	}

	private static void hardLevel() {
		Scanner input = new Scanner(System.in);
		int row;
		int column;
		int piece;
		System.out.println("This is the medium Level");
		DifficultBoard board = new DifficultBoard();
		while (board.checkCompleted() == false) {
			board.printBoard();
			if (board.checkCompleted() == false) {
				System.out
						.println("What piece do you want to add to your board?");
				row = input.nextInt();
				column = input.nextInt();
				piece = input.nextInt();
				//While the number of columns or row are bigger or equal to 5 you will have to put a real number
				
				if(row >=5 || column >=5){
					System.out.println("Please enter a real number");
					row = input.nextInt();
					column = input.nextInt();
					piece = input.nextInt();
					board.addPiece(row, column, piece);
				}
				else{				
					board.addPiece(row, column, piece);
				}
			}
		}
		if (board.checkAnswer() == true) {
			System.out.println("You lost");
		} else {
			System.out.println("You won");
			input.close();
		}

	}

	private static void easyLevel() {
		Scanner input = new Scanner(System.in);
		int row;
		int column;
		int piece;
		System.out.println("This is the easy Level");
		EasyBoard board = new EasyBoard();
		while (board.checkCompleted() == false) {
			board.printBoard();
			if (board.checkCompleted() == false) {
				System.out
						.println("What piece do you want to add to your board?");
				row = input.nextInt();
				column = input.nextInt();
				piece = input.nextInt();
				
				//While the number of columns or row are bigger or equal to 5 you will have to put a real number
				
				if(row >=5 || column >=5 || piece > 25){
					System.out.println("Please enter a real number");
					row = input.nextInt();
					column = input.nextInt();
					piece = input.nextInt();
					board.addPiece(row, column, piece);
				}
				else{				
					board.addPiece(row, column, piece);
				}
			}
		}
		if (board.checkAnswer() == true) {
			System.out.println("You won");
		} else {
			System.out.println("You lost");
			input.close();
		}

	}

}