package com.zeta.conditions;

public class Emailques {

	public static void main(String[] args) {
		String s="sreehitha.karukuri@gmail";
		StringBuffer t = new StringBuffer(30);
		boolean flag = true;
		for(int i=0;i<s.length();i++){
			t.append(s.charAt(i));
			if(s.charAt(i)=='@'){
				if(!s.substring(i+1,i+6).equals("gmail")){
					System.out.println(s.substring(i+1,i+6));
					flag = false;
					break;
				}
				int j = s.indexOf('.');
				String end = s.substring(j+1);
				if(end.equals("com")||end.equals("in")||end.equals("milt")||end.equals("biz")){
					flag = true;
					break;
				}
				else{
					flag=false;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Valid email");
		}
		else{
			System.out.println("Invalid email");
		}
	}

}
