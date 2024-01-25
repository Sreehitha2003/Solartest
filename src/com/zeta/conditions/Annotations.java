package com.zeta.conditions;

import static com.zeta.helper.Help.*;

import java.util.Arrays;

import com.zeta.helper.Help;

class z{
	public void display(){
		lg.info("child");
	}
}
public class Annotations extends z{
	@Override
	public void display(){
		Integer a[] = {1,2,8,29};
		Arrays.sort(a);
		for(Object i:a){
			Help.function(Annotations.class).info(i);
		}
	}
	
	public static void main(String ...a){
		new Annotations().display();
	}
}
