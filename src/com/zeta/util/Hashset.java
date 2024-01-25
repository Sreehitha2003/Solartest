package com.zeta.util;
import java.util.*;

import com.zeta.helper.Help;

public class Hashset {
public static void main(String ...args){
	HashSet h = new HashSet();
	HashSet p = new HashSet();
	h.add(34);
	h.add(45);
	h.add(34);
	h.add("Zeta");
	Help.function(Hashset.class).info(h);
	Set s = Collections.unmodifiableSet(h);
	s.add(2);
	Help.function(Hashset.class).info(s);
	
	
	
LinkedList ll=new LinkedList();
ll.add(new Integer(22));
ll.add(new Integer(44));
ll.add(new String("Zeta"));
ll.add(new String("HDFC"));
Help.function(ArrList.class).info(ll);
List l = Collections.unmodifiableList(ll);
l.add(24356);
}
}
