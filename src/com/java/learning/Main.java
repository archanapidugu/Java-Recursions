package com.java.learning;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//Q1.Print Numbers
		System.out.println("Q1. Print Numbers");
		printNumbers(5);
		System.out.println("Q2. Cat Eyes");
		System.out.println(catEyes(5));
		System.out.println("Q3. Power method");
		System.out.println(power(2, 6));
		System.out.println("Q4. Factorial");
		System.out.println(factorial(5));
		System.out.println("Q5. Fibonnaci Series");
		for (int i = 0; i < 6; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println("\nQ6. Mobile Speakers");
		System.out.println(mobileSpeakers(4));
		
		System.out.println("Q7. Sum of Digits: ");
		System.out.println(sumOfDigits(1234));
		
		System.out.println("Q8. Count Fives: ");
		System.out.println(countFive(2353515));
		
		System.out.println("Q9. Binary Search: ");
		int[] array = {11, 34, 56, 87, 90, 123};
		System.out.println(binarySearch(array, 87, 0, array.length-1));
		
	}
	
	public static int printNumbers(int num) {
		if(num == 0) {
			return num;
		}else {
			System.out.println(num);
			return printNumbers(num - 1);
		}
	}
	
	public static int catEyes(int cats) {
		if(cats == 0) {
			return 0;
		}else {
			return 2 + (int)catEyes(cats - 1);
		}
	}
	
	public static int power(int base, int num) {
		if(num == 0) {
			return 1;
		}else {
			return base * power(base, num - 1);
		}
	}
	
	public static int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}else {
			return num * factorial(num - 1);
		}
	}
	
	public static int fibonacci(int num) {
		if(num == 0) {
			return 0;
		}else if(num == 1 || num == 2){
			return 1;
		}else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
	
	public static int mobileSpeakers(int mobiles) {
		if (mobiles == 0) {
			return 0;
		}else {
			if(mobiles % 2 == 0) {
				return 2 + mobileSpeakers(mobiles - 1);
			}else {
				return 1 + mobileSpeakers(mobiles - 1);
			}
		}
	}
	
	public static int sumOfDigits(int num) {
		if(num <= 9) {
			return num;
		}else {
			return num%10 + sumOfDigits(num / 10);
		}
	}
	
	public static int countFive(int num) {
		if(num <= 9) {
			if(num == 5) {
				return 1;
			}else {
				return 0;
			}
		}else {
			if(num % 10 == 5) {
				return 1 + countFive(num / 10);
			}else {
				return 0 + countFive(num / 10);
			}
		}
	}
	
	public static int binarySearch(int[] array, int key, int start, int end) {
		if(start <= end) {
			int middle = start + (end-start)/2;
			if(array[middle] > key) {
				return binarySearch(array, key, start, middle-1);
			}else if(array[middle] < key) {
				return binarySearch(array, key, middle+1, end);
			}else {
				return middle;
			}
		}else {
			return -1;
		}
	}
}
