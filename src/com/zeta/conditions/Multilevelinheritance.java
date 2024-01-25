package com.zeta.conditions;

import com.zeta.helper.Help;
import static com.zeta.helper.Help.*;

class main{
	public void func(){
	lg.info("Inherited");
	}
}
class level extends main{
	public void func(){
		Help.function(Multilevelinheritance.class).info("level");


	}
}
public class Multilevelinheritance extends level {
	public static void main(String ...a){
		
		level l = new level();
		l.func();
	}
}
