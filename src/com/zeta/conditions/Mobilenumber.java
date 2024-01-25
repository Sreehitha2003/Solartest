package com.zeta.conditions;

import java.util.Scanner;

public class Mobilenumber {
	
	public static void changingnumber(long num){
		String n = String.valueOf(num);
		n = n.replace('6','7');
		System.out.println("The changed mobile number is "+n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		if(String.valueOf(num).length()==10){
		System.out.println("The mobile number is "+"+91"+num);
		}
		
		changingnumber(num);
		
	}

}
