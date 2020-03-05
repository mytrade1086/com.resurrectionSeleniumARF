package com.resurrectionSeleniumARF;

public class xpathTricks {
	
	
	public static void main(String[] args) {
		
		//http://makeseleniumeasy.com/2017/04/16/part-2-all-about-xpath-different-ways-of-writing-xpath-expression/
		//http://makeseleniumeasy.com/2019/06/23/xpath-method-string-usage-in-locating-element-how-it-is-different-from-text/
		
		
		//file:///C:/Users/sunshine/Desktop/amodtablexpath.html
		
		//tr/td[@data-column='Book Name' and text()!='SQL']    //not equals
		
		//tr/td[@data-column='Total Count' and text()>'21']   //greater than
		
		
		
		
		//tr/td[@data-column='Book Name' and not (contains( text(),'SQL'))]    //not contains
		
		
		//tr/td[@data-column='In stock' and ( text()>50 and text()<100)]  //in between
		
		
	}

}
