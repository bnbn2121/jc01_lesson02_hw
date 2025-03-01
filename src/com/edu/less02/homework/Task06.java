package com.edu.less02.homework;

public class Task06 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double result;

		a = 5;
		b = 4;
		c = 3;
		
		result = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println("ответ: " + result);
	}

}
