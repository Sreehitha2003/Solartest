package com.zeta.conditions;

public class Q4 {
	public static void main(String[] args){
		int i=26;
		int j=97;
//		while(i<=26){
//			if(i==0){ System.out.print(i+" ");i++;}
//			System.out.print(i+""+(char)j+" ");
//			i++;j--;
//		}
		do{
			if(i==0){ System.out.print(i+" ");i++;}
			System.out.print(i+""+(char)j+" ");
			i--;j++;
		}while(i>0);
	}
}
