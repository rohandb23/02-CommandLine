package com.aurionpro.test;

public class SecondLargest {
	public static void main(String[] args) {
		String a="";
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length-1; j++) {
				if(Integer.parseInt(args[j])>Integer.parseInt(args[j+1])) {
					a = args[j];
					args[j]=args[j+1];
					args[j+1]=a;
				}
			}
		}
		System.out.println(args[args.length-2]);
	}
}
