package 构造实验2;

public class SubstractOperation extends BinaryOperation_3_2 {
	public SubstractOperation() {	
		generateBinaryOperation('-');		
	}	
	boolean checkingCalculation(int anInteger){
		return anInteger >= LOWER;
	}
	int calculate(int left, int right){
		return left-right;
	}		


}
