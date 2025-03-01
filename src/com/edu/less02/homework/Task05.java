package com.edu.less02.homework;

public class Task05 {

	public static void main(String[] args) {
		double w; 		/* ширина */
		double l; 		/* длина */
		double k; 		/* коэф. отношения длины к ширине */
		double s; 		/* площадь */

		/* Дано */
		l = 8;
		k = 2;

		/* Решение */
		w = l / k;
		s = w * l;
		System.out.println("площадь прямоугольника - " + s);

	}

}
