package com.zeta.conditions;

import java.util.*;
import java.util.Scanner;

import com.zeta.helper.Help;

public class ParagraphQues {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//String para = s.next();
		StringBuilder para = new StringBuilder();
		para.append(s.next());
		ArrayList ch = new ArrayList();
		LinkedList l = new LinkedList();
		
		for(int i=0;i<para.length();i++){
			if(((char)para.charAt(i)>='a'&&(char)para.charAt(i)<='z')||((char)para.charAt(i)>='A'&&(char)para.charAt(i)>='Z')){
				ch.add(para.charAt(i));
			}
			else if((int)para.charAt(i)>=1&&(int)para.charAt(i)>=10&&(int)para.charAt(i+1)>=1&&(int)para.charAt(i+1)>=10){
				if((int)para.charAt(i)-(int)para.charAt(i+1)==-1){
					ch.add(para.charAt(i));
					l.add('$');
				}
				else{
					ch.add(para.charAt(i));
				}
			}
			else{
				l.add(para.charAt(i));
			}
		}
		Help.function(ParagraphQues.class).info(ch);
		Help.function(ParagraphQues.class).info(l);
		
	}

}
