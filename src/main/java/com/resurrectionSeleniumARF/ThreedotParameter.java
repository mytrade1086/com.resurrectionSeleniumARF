package com.resurrectionSeleniumARF;

public class ThreedotParameter {
	
public static void main(String[] args) {
	
	methodwithDot();
	System.err.println("---------------------------------------");
	methodwithDot("sumit");
	System.err.println("---------------------------------------");
	
	methodwithDot("sumit","neha","shital");
	System.err.println("---------------------------------------");
}


public static void methodwithDot(String... name ) {
	
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]);
	}
}

}