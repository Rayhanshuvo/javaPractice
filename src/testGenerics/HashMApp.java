package testGenerics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HashMApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sortedArray = { "A", "D", "C", "B" };
		Arrays.sort(sortedArray);
		for (String takenVar : sortedArray) {
			// System.out.println(takenVar);

		}

		int index = Arrays.binarySearch(sortedArray, "c");

		System.out.println(index);
		index = Arrays.binarySearch(sortedArray, "e");
		System.out.println(index);
		int[] sortedIntArray = new int[] { 1, 2, 3, 5, 7 };

		index = Arrays.binarySearch(sortedIntArray, 6);
		System.out.println(index);
		List<String> list = Arrays.asList(sortedArray);
		Collections.shuffle(list);
		System.out.println(list);

	}

}
