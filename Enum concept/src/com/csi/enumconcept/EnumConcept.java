package com.csi.enumconcept;

public class EnumConcept {
	enum Months{
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,
		OCTOBER, NOVEMBER, DECEMBER
	}
public static void main(String[] args) {
	for (Months m : Months.values()) {
		System.out.println(m);
	}
}
}
