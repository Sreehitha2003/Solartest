package com.zeta.conditions;

public class Question2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num%400==0){
			System.out.println("Leap year");
		}
		else if(num%4==0&&num%100!=0){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not a Leap year");
		}
	}

}
