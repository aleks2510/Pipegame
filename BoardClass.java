package game;

public class BoardClass {
	//Generate the Board of 5 x 5 spaces
	PipeSuperClass [][] gameBoard = new PipeSuperClass [5][5];
	PiecesAvailable available = new PiecesAvailable();
	
	
	//Non-arg constructor 
	BoardClass() {
	}
	
	//This method is going to print the table with the values 0-4  in the top and side.
	void printBoard() {
		System.out.println("");
		for(int i=0; i<6; i++) {
			if(i == 0)
				System.out.println("    0  1  2  3  4");
			else {
				for(int j=0; j<6; j++) {
					if(j == 0 && i == 1)
						System.out.printf("%d =", i-1);
					else if(j == 0)
						System.out.printf("%d  ", i-1);
					else {
						System.out.printf("[");
						printValue(i-1, j-1);
						System.out.printf("]");
						if(i == 5 && j == 5)
							System.out.println("=");
						else if(j == 5)
							System.out.println("");
					}
				}
			}
		}
		
		System.out.println("\nPieces Available");
		available.printAvailable();
		System.out.println("");
	}
	//This method is going to check if all the answers on the board matches to the main answer.
	boolean checkAnswer() {
		boolean answer = true;
		
		//Checking values Left to Right
		for(int i=0; i<5; i++){
			for(int j=0; j<4; j++){
				boolean compare = compareLeftRight(gameBoard[i][j], gameBoard[i][j+1]);
				if(compare == false){
					answer = false;
					break;
				}
			}
			if(answer == false)
				break;
		}
		
		//Check values Top to Bottom
		
		for(int i=0; i<4; i++){
			if(answer == false)
				break;
			for(int j=0; j<5; j++){
				boolean compare = compareTopBottom(gameBoard[i][j], gameBoard[i+1][j]);
				if(compare == false){
					
					answer = false;
					
					break;
				}
			}
			if(answer == false)
				break;
		}
		
		return answer;
	}
	//This method is comparing the 2 pieces that are next to each other horizontally.
	static boolean compareLeftRight(PipeSuperClass pieceLeft, PipeSuperClass pieceRight) {
		if(pieceLeft.isSide2() == pieceRight.isSide4())
			return true;
		else
			return false;
	}
	//This method is comparing the 2 pieces that are next to each other vertically
	static boolean compareTopBottom (PipeSuperClass pieceTop, PipeSuperClass pieceBottom) {
		if(pieceTop.isSide3() == pieceBottom.isSide1())
			return true;
		else
			return false;
	}
	//This method is checks if all the pieces in the board are filled 
	boolean checkCompleted() {
		boolean complete = true;
		
		for(int i=0; i<25; i++){
			PipeSuperClass temp = available.getPiece(i);
			if(temp.compareEmpty(temp) == false){
				complete = false;
				break;
			}
		}
		
		return complete;
	}
	//This method is going to create an empty value, pass a number in that one and replace the value in the board with that one
	//the available piece is deleted in your board.   
	void addPiece(int row, int column, int piece) {
		Empty replace = new Empty();
		gameBoard[row][column] = available.getPiece(piece-1);
		available.append(piece-1, replace);
	}
	//This method is going to allow the user to take any placed piece from the board.
	void takePiece(int row, int column) {
		Empty replace = new Empty();
		available.putBack((gameBoard[row-1][column-1]));
		gameBoard[row][column] = replace;
	}
	
	//This method is going to print a character for each piece.
	void printValue(int row, int column) {
		PipeSuperClass value = new PipeSuperClass();
		value = gameBoard[row][column];
		
		if(value instanceof PipeES)
			System.out.printf("r");
		else if(value instanceof PipeEW)
			System.out.printf("-");
		else if(value instanceof PipeNE)
			System.out.printf("L");
		else if(value instanceof PipeNS)
			System.out.printf("|");
		else if(value instanceof PipeNW)
			System.out.printf("j");
		else if(value instanceof PipeSW)
			System.out.printf("\u00AC");
		else if(value instanceof PipeNESW)
			System.out.printf("+");
		else
			System.out.printf(" ");
	}

}
//This class is going to create a board called EasyBoard which will display a board with 25 pieces to solve the easy board.
class EasyBoard extends BoardClass {
	
	EasyBoard() {
		super();
		
		PipeES ES1 = new PipeES(); available.append(0, ES1);
		PipeES ES2 = new PipeES(); available.append(1, ES2);
		PipeES ES3 = new PipeES(); available.append(2, ES3);
		PipeES ES4 = new PipeES(); available.append(3, ES4);
		PipeES ES5 = new PipeES(); available.append(4, ES5);
	
		PipeEW EW1 = new PipeEW(); available.append(5, EW1);
		PipeEW EW2 = new PipeEW(); available.append(6, EW2);
		PipeEW EW3 = new PipeEW(); available.append(7, EW3);
		PipeEW EW4 = new PipeEW(); available.append(8, EW4);
		
		PipeNE NE1 = new PipeNE(); available.append(9, NE1);
		PipeNE NE2 = new PipeNE(); available.append(10, NE2);
		PipeNE NE3 = new PipeNE(); available.append(11, NE3);
		
		PipeNS NS1 = new PipeNS(); available.append(12, NS1);
		PipeNS NS2 = new PipeNS(); available.append(13, NS2);
		PipeNS NS3 = new PipeNS(); available.append(14, NS3);
		
		PipeNW NW1 = new PipeNW(); available.append(15, NW1);
		PipeNW NW2 = new PipeNW(); available.append(16, NW2);
		PipeNW NW3 = new PipeNW(); available.append(17, NW3);
		PipeNW NW4 = new PipeNW(); available.append(18, NW4);
		PipeNW NW5 = new PipeNW(); available.append(19, NW5);
		
		PipeSW SW1 = new PipeSW(); available.append(20, SW1);
		PipeSW SW2 = new PipeSW(); available.append(21, SW2);
		PipeSW SW3 = new PipeSW(); available.append(22, SW3);
		
		PipeNESW NESW1 = new PipeNESW(); available.append(23, NESW1);
		
		NoPipes None = new NoPipes(); available.append(24, None);
	}
	
}
//This class is going to create a board called MediumBoard which will display a board with 25 pieces to solve the easy board.
class MediumBoard extends BoardClass {
	
	MediumBoard(){
		super();
		
		PipeES ES1 = new PipeES(); available.append(0, ES1);
		PipeES ES2 = new PipeES(); available.append(1, ES2);
		PipeES ES3 = new PipeES(); available.append(2, ES3);
		PipeES ES4 = new PipeES(); available.append(3, ES4);
		PipeES ES5 = new PipeES(); available.append(4, ES5);
		
		PipeEW EW1 = new PipeEW(); available.append(5, EW1);
		PipeEW EW2 = new PipeEW(); available.append(6, EW2);
		PipeEW EW3 = new PipeEW(); available.append(7, EW3);
		PipeEW EW4 = new PipeEW(); available.append(8, EW4);
		PipeEW EW5 = new PipeEW(); available.append(9, EW5);
		PipeEW EW6 = new PipeEW(); available.append(10, EW6);
		
		PipeNE NE1 = new PipeNE(); available.append(11, NE1);
		PipeNE NE2 = new PipeNE(); available.append(12, NE2);
		PipeNE NE3 = new PipeNE(); available.append(13, NE3);
		
		PipeNS NS1 = new PipeNS(); available.append(14, NS1);
		
		PipeNW NW1 = new PipeNW(); available.append(15, NW1);
		PipeNW NW2 = new PipeNW(); available.append(16, NW2);
		PipeNW NW3 = new PipeNW(); available.append(17, NW3);
		PipeNW NW4 = new PipeNW(); available.append(18, NW4);
		PipeNW NW5 = new PipeNW(); available.append(19, NW5);
		
		PipeSW SW1 = new PipeSW(); available.append(20, SW1);
		PipeSW SW2 = new PipeSW(); available.append(21, SW2);
		PipeSW SW3 = new PipeSW(); available.append(22, SW3);
		
		PipeNESW NESW1 = new PipeNESW(); gameBoard[2][2] = NESW1;
		
		NoPipes None = new NoPipes(); available.append(23, None);
		
		Empty Empty1 = new Empty(); available.append(24, Empty1);
	}
}

class DifficultBoard extends BoardClass {
	
	DifficultBoard(){
		super();
		
		PipeES ES1 = new PipeES(); available.append(0, ES1);
		PipeES ES2 = new PipeES(); available.append(1, ES2);
		PipeES ES3 = new PipeES(); available.append(2, ES3);
		PipeES ES4 = new PipeES(); available.append(3, ES4);
		PipeES ES5 = new PipeES(); available.append(4, ES5);
		PipeES ES6 = new PipeES(); available.append(5, ES6);
		PipeES ES7 = new PipeES(); available.append(6, ES7);
		
		PipeEW EW1 = new PipeEW(); available.append(7, EW1);
		PipeEW EW2 = new PipeEW(); available.append(8, EW2);
		PipeEW EW3 = new PipeEW(); available.append(9, EW3);
		PipeEW EW4 = new PipeEW(); available.append(10, EW4);
		PipeEW EW5 = new PipeEW(); available.append(11, EW5);
		
		PipeNE NE1 = new PipeNE(); available.append(12, NE1);
		PipeNE NE2 = new PipeNE(); available.append(13, NE2);
		
		PipeNS NS1 = new PipeNS(); available.append(14, NS1);
		
		PipeNW NW1 = new PipeNW(); available.append(15, NW1);
		PipeNW NW2 = new PipeNW(); available.append(16, NW2);
		PipeNW NW3 = new PipeNW(); available.append(17, NW3);
		PipeNW NW4 = new PipeNW(); available.append(18, NW4);
		PipeNW NW5 = new PipeNW(); available.append(19, NW5);
		PipeNW NW6 = new PipeNW(); available.append(20, NW6);
		
		PipeSW SW1 = new PipeSW(); available.append(21, SW1);
		PipeSW SW2 = new PipeSW(); available.append(22, SW2);
		
		PipeNESW NESW1 = new PipeNESW(); gameBoard[1][1] = NESW1;
		PipeNESW NESW2 = new PipeNESW(); gameBoard[3][2] = NESW2;
		
		Empty Empty1 = new Empty(); available.append(23, Empty1);
		available.append(24, Empty1);
	}
}

//This class creates an object that allows 25 available pieces.
class PiecesAvailable {
	PipeSuperClass[] storage = new PipeSuperClass[25];
	
	PiecesAvailable() {
	}
	
	//This is the getter to the available class.
	PipeSuperClass[] getAvailable() {
		return storage;
	}
	//This is the setter of the getPieces
	PipeSuperClass getPiece(int index) {
		return storage[index];
	}
	//This method allows you to add an piece to the class.
	void append(int index, PipeSuperClass piece) {
		storage[index] = piece;
	}
	
	void putBack(PipeSuperClass piece) {
		for(int i=0; i<25; i++)
			if(storage[i] instanceof Empty) {
				storage[i] = piece;
			}
	}
	//This method prints the available pieces in the game.
	void printAvailable() {
		for(int i=0; i<storage.length; i++) {
			if(storage[i] instanceof PipeES)
				System.out.printf("%d: r", i+1);
			else if(storage[i] instanceof PipeEW)
				System.out.printf("%d: -", i+1);
			else if(storage[i] instanceof PipeNE)
				System.out.printf("%d: L", i+1);
			else if(storage[i] instanceof PipeNS)
				System.out.printf("%d: |", i+1);
			else if(storage[i] instanceof PipeNW)
				System.out.printf("%d: j", i+1);
			else if(storage[i] instanceof PipeSW)
				System.out.printf("%d: \u00AC", i+1);
			else if(storage[i] instanceof PipeNESW)
				System.out.printf("%d: +", i+1);
			else if(storage[i] instanceof NoPipes)
				System.out.printf("%d: [ ]", i+1);
			else if(storage[i] instanceof Empty)
				System.out.printf("");
			
			if(i == 10 || i == 20)
				System.out.println("");
			else
				System.out.printf(" ");
		}
	}
}
