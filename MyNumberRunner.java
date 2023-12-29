package com.learningJavaFullStack.In28Minutes;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(5);
		Boolean isPrime = number.isPrime();
		System.out.println(isPrime);
		
		int sum = number.sumUptoN();
		System.out.println("sumUptoN " + sum);
		
		int sumOfDivisor = number.sumOfDivisor();
		System.out.println("sumOfDivisor " + sumOfDivisor);
		
		number.printANumberTriangle();
	}
}
