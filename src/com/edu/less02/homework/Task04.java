package com.edu.less02.homework;

public class Task04 {

	public static void main(String[] args) {
		int numberOfSmallBotles;								
		int numberOfBigBotles;
		double totalVolumeSmallBottles;
		double totalVolumeBigBottles;
		double volumeOneSmallBottle; 			
		double volumeOneBigBottle; 			
		double deltaBetweenBottleTypes; 						

		/* Дано */
		numberOfSmallBotles = 16;
		numberOfBigBotles = 10;
		totalVolumeSmallBottles = 80;
		deltaBetweenBottleTypes = 4;

		/* Решение */
		volumeOneSmallBottle = totalVolumeSmallBottles / numberOfSmallBotles;
		System.out.println("объем одного малого бидона - " + volumeOneSmallBottle + " л.");

		volumeOneBigBottle = volumeOneSmallBottle + deltaBetweenBottleTypes;
		System.out.println("объем одного большого бидона - " + volumeOneBigBottle + " л.");

		totalVolumeBigBottles = volumeOneBigBottle * numberOfBigBotles;
		System.out.println("в " + numberOfBigBotles + " больших бидонов может поместиться " + totalVolumeBigBottles + " л. молока");
	}

}
