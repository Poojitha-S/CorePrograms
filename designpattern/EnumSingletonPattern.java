package com.bridgeit.designpattern;

public enum EnumSingletonPattern {
	INSTANCE,START;
	public static void doSomthing()
	{
		System.out.println("In enum doSomething");
	}
}
