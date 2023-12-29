package com.learningJavaFullStack.In28Minutes;

public class LearnMultipleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMultiple number = new LearnMultiple();
		int lcm = number.printLCM(6,8);
		int hcf = number.printHCF(48,18);
		int reverseNumber = number.reverseNumber(759);
		
		System.out.println("LCM of these two number is : " + lcm);
		System.out.println("HCF of these two number is : " + hcf);
		System.out.println("Reverse of Number : " + reverseNumber);
	}
}
