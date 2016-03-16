package game;

public class PipeSuperClass {
	protected int side1;
	protected int side2;
	protected int side3;
	protected int side4;
	PipeSuperClass(){	
	}

}

class NoPipes extends PipeSuperClass{
	
	boolean side1 = false;
	boolean side2 = false;
	boolean side3 = false;
	boolean side4 = false;
	
	NoPipes(){
		super();
	}	

}

class PipeStart extends PipeSuperClass{

	boolean side1 = false;
	boolean side2 = true;
	boolean side3 = false;
	boolean side4 = false;
	
	PipeStart(){
		super();
	}
	
}

class PipeEnding extends PipeSuperClass{

	boolean side1 = false;
	boolean side2 = false;
	boolean side3 = false;
	boolean side4 = true;
	
	
	PipeEnding(){
		super();
	}
	
}

class PipeES extends PipeSuperClass{
	
	boolean side1 = false;
	boolean side2 = true;
	boolean side3 = true;
	boolean side4 = false;
	
	PipeES(){
		super();
	}

}

class PipeEW extends PipeSuperClass{
	
	boolean side1 = false;
	boolean side2 = true;
	boolean side3 = false;
	boolean side4 = true;
	
	
	PipeEW(){
		super();
	}

}

class PipeNE extends PipeSuperClass{
	boolean side1 = true;
	boolean side2 = true;
	boolean side3 = false;
	boolean side4 = false;
	
	PipeNE(){	
		super();
	}
	
}

class PipeNESW extends PipeSuperClass{

	boolean side1 = true;
	boolean side2 = true;
	boolean side3 = true;
	boolean side4 = true;
	
	PipeNESW(){	
		super();
	}
	
}

class PipeNS extends PipeSuperClass {
	boolean side1 = true;
	boolean side2 = false;
	boolean side3 = true;
	boolean side4 = false;
	
	PipeNS(){
		super();
	}
		
}

class PipeNW extends PipeSuperClass{
	boolean side1 = true;
	boolean side2 = false;
	boolean side3 = false;
	boolean side4 = true;
	
	
	PipeNW(){
		super();
	}
		
}

class PipeSW extends PipeSuperClass{

	boolean side1 = false;
	boolean side2 = false;
	boolean side3 = true;
	boolean side4 = true;
	
	PipeSW(){
		super();
	}
}