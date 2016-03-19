//This class is the Super class PipeSuperClass, and it will create a all false side as the default object.
package game;

public class PipeSuperClass {
	private boolean side1 = false;
	private boolean side2 = false;
	private boolean side3 = false;
	private boolean side4 = false;
	PipeSuperClass(){	
	}
	
	
	
	
	
	boolean compareEmpty(PipeSuperClass piece) {
		if(piece instanceof Empty == true)
			return true;
		else
			return false;
	}





	protected boolean isSide2() {
		return side2;
	}





	protected void setSide2(boolean side2) {
		this.side2 = side2;
	}





	protected boolean isSide1() {
		return side1;
	}





	protected void setSide1(boolean side1) {
		this.side1 = side1;
	}





	protected boolean isSide3() {
		return side3;
	}





	protected void setSide3(boolean side3) {
		this.side3 = side3;
	}





	protected boolean isSide4() {
		return side4;
	}





	protected void setSide4(boolean side4) {
		this.side4 = side4;
	}





}
