package game;

public class PipeSuperClass {
	protected boolean side1;
	protected boolean side2;
	protected boolean side3;
	protected boolean side4;
	PipeSuperClass(){	
	}
	
	boolean compareEmpty(PipeSuperClass piece) {
		if(piece instanceof Empty == true)
			return true;
		else
			return false;
	}
}

class NoPipes extends PipeSuperClass{
	
	NoPipes(){
		super();
		side1 = false;
		side2 = false;
		side3 = false;
		side4 = false;
	}	

}

class Empty extends PipeSuperClass {
	
	Empty(){
		super();
		side1 = false;
		side2 = false;
		side3 = false;
		side4 = false;
	}
}

class PipeStart extends PipeSuperClass{
	
	PipeStart(){
		super();
		side1 = false;
		side2 = true;
		side3 = false;
		side4 = false;
	}
	
}

class PipeEnding extends PipeSuperClass{
	
	PipeEnding(){
		super();
		side1 = false;
		side2 = false;
		side3 = false;
		side4 = true;
	}
	
}

class PipeES extends PipeSuperClass{
	
	PipeES(){
		super();
		side1 = false;
		side2 = true;
		side3 = true;
		side4 = false;
	}

}

class PipeEW extends PipeSuperClass{
	
	PipeEW(){
		super();
		side1 = false;
		side2 = true;
		side3 = false;
		side4 = true;
	}

}

class PipeNE extends PipeSuperClass{
	
	PipeNE(){	
		super();
		side1 = true;
		side2 = true;
		side3 = false;
		side4 = false;
	}
	
}

class PipeNESW extends PipeSuperClass{
	
	PipeNESW(){	
		super();
		side1 = true;
		side2 = true;
		side3 = true;
		side4 = true;
	}
	
}

class PipeNS extends PipeSuperClass {
	
	PipeNS(){
		super();
		side1 = true;
		side2 = false;
		side3 = true;
		side4 = false;
	}
		
}

class PipeNW extends PipeSuperClass{
	
	PipeNW(){
		super();
		side1 = true;
		side2 = false;
		side3 = false;
		side4 = true;
	}
		
}

class PipeSW extends PipeSuperClass{
	
	PipeSW(){
		super();
		side1 = false;
		side2 = false;
		side3 = true;
		side4 = true;
	}
}