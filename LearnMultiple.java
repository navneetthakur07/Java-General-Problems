package com.learningJavaFullStack.In28Minutes;

public class LearnMultiple {

	public int printLCM(int number1, int number2) {
		
		if (number1<0 && number2<0) {
			return -1;
		}
		
		if (number1==0 && number2==0) {
			return 0;
		}
		
		int max = Math.max(number1, number2);
		int lcm = max;
		while (true) {
			boolean isFinaLCM = lcm%number1==0 && lcm%number2==0;
            if (isFinaLCM) {
                return lcm;   
            }
             lcm+=max;
			}	
		}
		

	public int printHCF(int number1, int number2) {
		
		if (number1<0 || number2<0) {
			return -1;
		}
		
		if (number1==0 || number2==0) {
			return 0;
		}
		
		if (number1==number2) {
			return number1;
		}
		
		int min = Math.min(number1, number2);
		int hcf = min;
		
		for (int i=min; i>0; i--) {
            boolean isGCD = number1%i == 0 && number2%i == 0;
            if (isGCD) {
              return i;   
            }
        }
        return -1;
	}

	public int reverseNumber(int number) {
		// TODO Auto-generated method stub
		
		if (number<0) {
			return -1;
		}
		
		if (number==0) {
			return 0;
		}
		
		int rev =0;
		int rem = 0;
		
		while (number>0) {
			rem = number%10;
			rev = rev*10 + rem;
			number = number/10;
		}
		return rev;
	}
}
