/**
 *Java 1. Homework 2
 *
 *@author Morilov
 *@version 9.10.2021
 */ 


class HomeWork2 {
    public static void main(String[] args) {
	System.out.println(checkSumm(7, 12));
	printNumbSign(13);
	System.out.println(checkNumbSign(-13));
	printLines("test my skill", 3);
	System.out.println(checkYear(2016));
    }

    static boolean checkSumm(int a, int b) {
	return a+b>=10 && a+b<=20;
    }

    static void printNumbSign(int numb) {
	System.out.println(numb>=0? "Numb is positive" : "Numb is negative");
    }

    static boolean checkNumbSign(int numb) {
	return numb<0;
    }

    static void printLines(String line, int numb) {
	for (int i=0; i<numb; i++) {
	    System.out.println(line);
	}
    }

    static boolean checkYear(int year) {
	//return year % 4 == 0 && year % 100 != 0 & year % 400 == 0;
	return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
