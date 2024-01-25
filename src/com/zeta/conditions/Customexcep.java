package com.zeta.conditions;

import static com.zeta.helper.Help.*;

import com.zeta.cexception.ZetaBoundsByteException;

public class Customexcep {
	public static void main(String ...a){
		try{
			byte b=1;
			byte a1=127;
			if((a1+b)>Byte.MAX_VALUE||(a1+b)<Byte.MIN_VALUE){
			   throw new ZetaBoundsByteException("Out of the range");
			}
			else{
				lg.info(a1+b);
			}
		}
		catch(Exception e){
			lg.error(e);
		}
	}
}
