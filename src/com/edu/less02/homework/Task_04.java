package com.edu.less02.homework;

public class Task_04 {

	public static void main(String[] args) {
		int n;
		int m;
		double sumN;
		double sumM;
		double vol1; 				/* объем 1 малого бидона */
		double vol2; 				/* объем 1 большого бидона */
		double del; 				/* разница большого и малого бидона */

		/* Дано */
		n = 13;
		m = 8;
		sumN = 80;
		del = 12;

		/* Решение */
		vol1 = sumN / n;
		System.out.println("объем одного малого бидона - " + vol1 + " л.");

		vol2 = vol1 + del;
		System.out.println("объем одного большого бидона - " + vol2 + " л.");

		sumM = vol2 * m;
		System.out.println("в " + m + " больших бидонов может поместиться " + sumM + " л. молока");
	}

}
