package ����ʵ��2;

public class BinaryOperationTester {
	public static void main(String[] args) {
		BinaryOperation_3_2 bop;
        System.out.println("test1:constructor('+')");   
        for (int i=0; i<10; i++){
        	bop = new AdditionOperation();
        	System.out.println(bop);
        }
        System.out.println("test1:constructor('-')");   
        for (int i=0; i<10; i++){
        	bop = new SubstractOperation();
        	System.out.println(bop);
        }
        
	}


}
