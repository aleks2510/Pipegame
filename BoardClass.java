package game;

public class BoardClass {
	//Generate the Board
	PipeSuperClass [][] board = new PipeSuperClass [5][5];
}

class EasyBoard extends BoardClass {
	
	EasyBoard() {
		super();
		
		PiecesAvailable available = new PiecesAvailable();
		
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

class MediumBoard extends BoardClass {
	
}

class DifficultBoard extends BoardClass {
	
}

class PiecesAvailable {
	PipeSuperClass[] storage = new PipeSuperClass[25];
	
	PiecesAvailable() {
	}
	
	PipeSuperClass[] getAvailable() {
		return storage;
	}
	
	void append(int index, PipeSuperClass piece) {
		storage[index] = piece;
	}
	
	void printAvailable() {
		for(int i=0; i<storage.length; i++) {
			if(storage[i] instanceof PipeES)
				System.out.printf("");
			else if(storage[i] instanceof PipeEW)
				System.out.printf("");
			else if(storage[i] instanceof PipeEW)
				System.out.printf("");
			else if(storage[i] instanceof PipeNE)
				System.out.printf("");
			else if(storage[i] instanceof PipeNS)
				System.out.printf("|");
			else if(storage[i] instanceof PipeNW)
				System.out.printf("");
			else if(storage[i] instanceof PipeSW)
				System.out.printf("");
			else if(storage[i] instanceof PipeNESW)
				System.out.printf("+");
			else if(storage[i] instanceof NoPipes)
				System.out.printf("[]");
			
			if(i == 10 || i == 20)
				System.out.println("");
			else
				System.out.printf(" ");
		}
	}
}

