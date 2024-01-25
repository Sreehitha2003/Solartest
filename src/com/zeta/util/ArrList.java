package com.zeta.util;

import java.util.*;

import com.zeta.helper.Help;
enum student{
	name,
	roll,favsub
}

public class ArrList {
	public static void main(String[] args){
		ArrayList ls = new ArrayList();
		ArrayList l = new ArrayList();
		ls.add(new Integer(34));
		l.add(new Integer(3));
		ls.add(new Integer(6));
		ls.add(new Integer(689));
		ls.add(new Integer(34));
		ls.add(new String("Zeta"));
		Help.function(ArrList.class).info(ls);
		ls.trimToSize();
		Help.function(ArrList.class).info(ls.size());
		Help.function(ArrList.class).info(ls.get(3).equals(new Integer(34)));
		Help.function(ArrList.class).info(ls.remove(3));
		Help.function(ArrList.class).info(ls);
		Help.function(ArrList.class).info(ls.addAll(l));
		//Help.function(ArrList.class).info(ls.replaceAll(34,67));
		Help.function(ArrList.class).info(ls);
		ls.removeAll(l);
		Help.function(ArrList.class).info(ls);
		ListIterator lt = ls.listIterator();
		while(lt.hasNext()){
			Help.function(ArrList.class).info(lt.next());
		}
		student hema = student.name;
		Help.function(ArrList.class).info(student.name);
		
		Vector v = new Vector();
		v.add(new Integer(34));
		v.add(new Integer(44));
		v.add(new Integer(574));
		v.add(new String("Zeta"));
		Help.function(ArrList.class).info(v);
		Collections.replaceAll(v,34,67);
		Help.function(ArrList.class).info(v);
		v.retainAll(ls);
		Help.function(ArrList.class).info(v);
		
		LinkedList ll=new LinkedList();
		ll.add(new Integer(22));
		ll.add(new Integer(44));
		ll.add(new String("Zeta"));
		ll.add(new String("HDFC"));
		Help.function(ArrList.class).info(ll);
	    Collections.shuffle(ll);
	    Help.function(ArrList.class).info(ll);
	    
	    Iterator i = ll.iterator();
	    while(i.hasNext()){
	    	Help.function(ArrList.class).info(i.next());
	    }
	    
	    
	}
}
