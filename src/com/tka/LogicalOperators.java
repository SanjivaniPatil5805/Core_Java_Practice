package com.tka;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		boolean check = !(5 >= 4);
		
		System.out.println(true && (8 > 9) || (5 <= 8 && 5 < 4) && check); // F
		
		System.out.println((9.7 < 9 || false && (5 ==5 && "Pune" != "Pune" || (6 > 5 || true)) && !(true)) && false); //	F
		
		
		int x = 5;
		System.out.println(x++ > 4 && ++x > 5 || x++ == 7 && --x > 5 ); // T
		System.out.println(x); // 7
		
	    x = 5;
		System.out.println(++x > 5 && x++ == 6 && ++x > 9 || x-- == 8 && --x > 5); // T
		System.out.println(x); // 6
		
	    x = 5;
	    System.out.println(x++ < 5 || ++x == 7 && x++ == 7 || ++x > 8 && x-- == 9); // T
		System.out.println(x); // 8
		
	    x = 5;
		System.out.println(++x == 6 && x++ == 6 || ++x == 8 && x-- == 8 || x++ > 7 && ++x == 10); // T 
		System.out.println(x); // 7
		
	    x = 5;
	    System.out.println(x++ == 5 && ++x == 7 || x++ == 7 && ++x > 8 || --x == 8 && x++ > 8); // T
		System.out.println(x); // 7
		
		x = 5;
		System.out.println(++x > 5 && x++ == 6 || ++x == 8 && x-- == 8 || x++ > 8 && --x == 9 || ++x == 10); // T
		System.out.println(x); //7
		
		}

}
