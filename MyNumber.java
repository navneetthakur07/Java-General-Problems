package com.learningJavaFullStack.In28Minutes;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
	}

	public Boolean isPrime() {
		// TODO Auto-generated method stub

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisor() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public void printANumberTriangle() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

