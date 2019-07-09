package com.cg.eis.service;

public interface Validator {
	
	String pricepattern="[1-9][0-9.]*";
	String quanpattern="[1-9][0-9]*";
	public static boolean validatedata(String data,String pattern)
	{
		return data.matches(pattern);
	}

}