package com.qa.main;

public class Runner {
	
	public static int sum(int num1, int num2, int num3) {
		
		int result = 0;
		
		if (num1 != num2 && num1 != num3 && num2 != num3) {
			result = num1 + num2 + num3;
		} else if (num1 == num2 && num2 == num3){
			result = 0;
		}	
		else if (num1 == num2) {
			result = num3;
		} else if (num1 == num3) {
			result = num2;
		} else if (num2 == num3 ) {
			result = num1;
		}
		
		return result;
		
	}

	public static void main(String[] args) {

		System.out.println(sum(1,2,3));
		System.out.println(sum(3,3,3));
		System.out.println(sum(1,1,2));
		
	}

}