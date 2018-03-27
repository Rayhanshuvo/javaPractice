package testGenerics;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimention {

	public static void main(String[] args) {

		// Three dimensional

		int i, j, k;
		// TODO Auto-generated method stub

		int valueToBeAdded = 0;

		int[][][] dimentionValue = new int[5][6][7];
		System.out.println("Type dimension:");

		Scanner sc = new Scanner(System.in);
		int takenValue = sc.nextInt();
		for (i = 0; i < takenValue; i++) {

			for (j = 0; j < 5; j++) {

				System.out.println("There i is:" + i);

				if (i == 2) {

					ArrayList<Integer> arrayList = new ArrayList<>();

					for (int h = 0; h < i; h++) {

						arrayList.add(i);

					}

				}

				for (k = 0; k < 5; k++) {

					dimentionValue[i][j][k] = valueToBeAdded;

					if (dimentionValue[i][j][k] == 0) {

						dimentionValue[i][j][k] = 1000;

						if (dimentionValue[i][j][k] == 1000) {

							System.out.println("Reached Maximum value here....");

						}

					}

					valueToBeAdded++;

					System.out.println("value here is:" + dimentionValue[i][j][k]);

				}

			}

		}

		System.out.println(dimentionValue[0][0][0]);
		int dimensionLength = dimentionValue[i].length;
		System.out.println("Length is:" + dimensionLength);

	}

}
