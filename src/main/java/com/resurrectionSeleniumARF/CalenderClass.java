package com.resurrectionSeleniumARF;

import java.util.Calendar;

public class CalenderClass {
	
	public static void main(String[] args) {
		
		Calendar cal=Calendar.getInstance();
		
		System.out.println(cal.getTime());  //Wed Jan 29 14:19:03 IST 2020
		int today=cal.get(Calendar.DAY_OF_MONTH) ;
		int date=cal.get(Calendar.DATE) ;
		int month=cal.get(Calendar.MONTH);
		
	System.out.println(today+" "+date+" "+month); //29 29  (0 for jan )
		
	}
	

}
