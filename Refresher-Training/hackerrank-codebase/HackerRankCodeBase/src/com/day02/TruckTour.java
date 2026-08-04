package com.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckTour {

	public static int truckTour(List<List<Integer>> petrolpumps) {

		int start = 0;
		int currentFuel = 0;
		int totalFuel = 0;

		for (int i = 0; i < petrolpumps.size(); i++) {

			int petrol = petrolpumps.get(i).get(0);
			int distance = petrolpumps.get(i).get(1);

			int balance = petrol - distance;

			currentFuel += balance;
			totalFuel += balance;

			if (currentFuel < 0) {
				start = i + 1;
				currentFuel = 0;
			}
		}

		return totalFuel >= 0 ? start : -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<List<Integer>> petrolPumps = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			List<Integer> pump = new ArrayList<>();

			pump.add(sc.nextInt());
			pump.add(sc.nextInt());

			petrolPumps.add(pump);
		}

		System.out.println(truckTour(petrolPumps));

		sc.close();

	}

}
