package com.edu.less02.homework;

public class Task_05 {

	public static void main(String[] args) {
		double a; 					/* ширина */
		double b; 					/* длина */
		double k; 					/* коэф. отношения длины к ширине */
		double s; 					/* площадь */

		/* Дано */
		b = 8;
		k = 2;

		/* Решение */
		a = b / k;
		s = a * b;
		System.out.println("площадь прямоугольника - " + s);

	}

}
