package com.resurrectionSeleniumARF;

public class WrapperClass {
	
	
	static int i=10;
	static int j=11;
	static String num="12";
	
	public static void main(String[] args) {
		
		//Important: Wrapper classes can hold null value as well
		           //Primitive can't hold null
		
		System.out.println(i+Integer.parseInt(num)); //22
		System.out.println(String.valueOf(i)+String.valueOf(j)); //1011
		
		
		
		
	}
			
			
			

}
