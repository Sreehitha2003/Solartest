package com.zeta.conditions;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {

	public static void main(String[] args) {
		AtomicInteger it = new AtomicInteger();
		System.out.println(it.incrementAndGet());
		System.out.println(it.incrementAndGet());
	}

}
