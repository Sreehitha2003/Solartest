package com.zeta.helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyHeader {
public static void main(String[] args) throws IOException{
	
	try{
		FileReader f = new FileReader("config//log4j.properties");
		Properties p = new Properties();
		p.load(f);
		System.out.println(p.getProperty("log4j.rootLogger"));
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
}
}
