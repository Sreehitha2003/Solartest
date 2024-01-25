package com.zeta.helper;

import org.apache.log4j.Logger;

public class Help {
	public static Logger lg = Logger.getLogger(Help.class);
	public static Logger function(Class a){
		Logger lgg = Logger.getLogger(a);
		return lgg;
	}
}
