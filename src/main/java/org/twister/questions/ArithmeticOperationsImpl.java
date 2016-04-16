package org.twister.questions;

public class ArithmeticOperationsImpl implements ArithmeticOperations{

	public int add(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args){
		new ArithmeticOperationsImpl().add(1,1);
		
		System.out.println((1+2+3+4+5)/5);
		System.out.println((1/5)+(2/5)+(3/5)+(4/5)+(5/5));
	}
}
