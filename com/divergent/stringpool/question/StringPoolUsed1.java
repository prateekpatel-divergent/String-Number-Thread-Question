package com.divergent.stringpool.question;

public class StringPoolUsed1 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello").intern();
		System.out.println((s1==s2));
	}
}
