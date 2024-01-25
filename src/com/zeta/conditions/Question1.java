package com.zeta.conditions;

public class Question1 {

	public static void main(String[] args) {
	  Character s = args[0].charAt(0);
	  if(((int)s >= 65 && (int)s <=90) || ((int)s>=97 &&(int)s<=122)){
		  System.out.println("It is a character");
	  }
	  else{
		  System.out.println("It is not a character");
	  }
	}
}
