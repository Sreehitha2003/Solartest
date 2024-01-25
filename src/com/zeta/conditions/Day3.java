package com.zeta.conditions;

import org.apache.log4j.Logger;

public class Day3 {
	public static void main(String args[]) {
		String s = "Zeta Sudexo Zeta sudexo Zeta Sudexo Zeta Sudexo";
		Logger lg = Logger.getLogger(Day3.class);
		// q1
		System.out.println(s.replace(" ", ""));
		// q2
		String d = "sreehitha";
		String b = "";
		for (int i = 0; i < d.length(); i++) {
			b = b + (char) (d.charAt(i) - 32);
		}
		String a = "";
		for (int i = 0; i < d.length(); i++) {

			if (i % 2 == 0)
				a = a + b.charAt(i);
			else
				a = a + d.charAt(i);
		}
		System.out.println(a);

		// q3
		System.out.println(s.length());
		int noofa = 0, noofs = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				noofa++;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'S' || s.charAt(i) == 115) {
				noofs++;
			}
		}
		System.out.println(noofa);
		System.out.println(noofs);

		// q4
		String p = "Zeta";
		String q = "Indy";
		String ans = "";
		Character ch;
		ans += p.charAt(0);
		ans += p.charAt(p.length() - 1);
		ans += q.substring(0, 2);
		lg.info(ans);
	}
}
