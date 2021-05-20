package info.hiding.test;

import info.hiding.MyDate;

public class TestMyDate {

	public static void main(String[] args) {

		MyDate mD = new MyDate();

		mD.setYear(2021);
		mD.setMonth(05);
		mD.setDay(30);
		
		

		System.out.println(mD.getYear());
		System.out.println(mD.getMonth());
		System.out.println(mD.getDay());
		
		System.out.println("=================================================");

		MyDate mD2 = new MyDate();

		mD2.setYear(1993);
		mD2.setMonth(7);
		mD2.setDay(40);
		
		System.out.println(mD2.getYear());
		System.out.println(mD2.getMonth());
		System.out.println(mD2.getDay());
		
		System.out.println("=================================================");
		
		
		MyDate mD3 = new MyDate(2021,5,15);
		
		System.out.println(mD3.getYear());
		System.out.println(mD3.getMonth());
		System.out.println(mD3.getDay());
		
		System.out.println("=================================================");
		
		
		
		MyDate mD4 = new MyDate(1999,17,50);
		
		System.out.println(mD4.getYear());
		System.out.println(mD4.getMonth());
		System.out.println(mD4.getDay());
		
		
		
		
		

	}

}
