package com.bridgeit.designpattern;

public class BillPughSingletonPattern {
	private BillPughSingletonPattern(){}
	private static class HelperClass
	{
		private static final BillPughSingletonPattern instance=new BillPughSingletonPattern(); 
	}
	public static BillPughSingletonPattern getInstance()
	{
		return HelperClass.instance;
	}
}
