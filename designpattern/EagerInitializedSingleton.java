package com.bridgeit.designpattern;

public class EagerInitializedSingleton {
	private EagerInitializedSingleton(){}
	private static EagerInitializedSingleton instance=new EagerInitializedSingleton();
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}
