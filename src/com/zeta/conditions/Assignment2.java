package com.zeta.conditions;

import java.util.Scanner;

public class Assignment2 {
	static String[] arr1={"one","two","three","four","five","six","seven","eight","nine"};
	static String[] tens={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	static String[] arr2={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
	public static void singledigits(int num){
		System.out.print(arr1[num-1]);
	}
	public static void seconddigit(int num){
		System.out.print(arr2[num-2]+" ");
	}
	public static void tensdigit(int num){
		System.out.print(tens[num-10]);
	}
	public static void hundreddigit(int num){
		System.out.print(arr1[num-1]+" hundred ");
	}
	public static void thousands(int num){
		System.out.print(arr1[num-1]+" thousand ");
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		final long num = s.nextLong();
		int len = Long.toString(num).length();
		
		switch(len){
		case 1:
			singledigits((int)num);
			break;
		case 2:
			int a = (int)num%10;
			int b = (int)(num/10)%10;
			if(b>=2){
				seconddigit(b);
				if(a>0) singledigits(a);
			}
			else {
				tensdigit((int)num);
			}
			break;
		case 3:
			int a1 = (int)num%10;
			int b1 = (int)(num/10)%10;
			int c1 = (int)(num/100)%10;
			if(b1>=2){
				hundreddigit(c1);
				seconddigit(b1);
				if(a1>0) singledigits(a1);
			}else{
				hundreddigit(c1);
				if(b1>0)tensdigit(b1*10+a1);
				else if(a1>0) singledigits(a1);
			}
		case 4:
			
		}
		
	}
}
