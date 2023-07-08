package com.aurionpro.test;

public class NumberSum {
	public static void main(String[] args) {
		int addition =0;
		for (int i = 0; i < args.length; i++) {
			addition +=Integer.parseInt(args[i]);
		}
		System.out.println("addition is : "+addition);
	}
}

