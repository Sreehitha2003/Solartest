package com.zeta.conditions;

public class Classes {
	int z;
	
	private Classes(int ...a) {
		z = a[3];
		System.out.println(z);
		return;
	}
	private Classes(int a) {
		System.out.println(a+"fghj");
		return;
	}
	static {
		System.out.print("yo");
	}

	{
		System.out.println("Unnamed block");
	}

	public static void main(String[] args) {
		Classes obj = new Classes(4);
	}
}
