package com.tka;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		
		int i = 4;
		i++; 
		--i;
		++i;
		System.out.println(++i); //print 6
		i--;
		++i;
		System.out.println(i + 5); //11
		i--; 
		--i;
		i++;
		++i;
		System.out.println(i--); // print 6 update 5
		--i;
		i++;
		++i;
		i++;
		i--;
		System.out.println(--i); // 5
		i--;
		++i;
		++i;
		++i;
	    --i;
		System.out.println(i++); //print 6 update 7
		System.out.println(i); //7
	}
}
