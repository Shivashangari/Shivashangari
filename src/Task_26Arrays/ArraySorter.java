package Task_26Arrays;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArraySorter {
	DataStorage oDataStorage = new DataStorage();

	void getTheArrayElements() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length of array:");
		try {
			oDataStorage.setLengthOfTheArray(scan.nextInt());
		} catch (InputMismatchException e1) {
			System.out.println("Enter a integer value");
			System.exit(0);
		}
		System.out.println("Enter the Array Elements :");
		int array[] = new int[oDataStorage.getLengthOfTheArray()];
		try {
			for (int index = 0; index < oDataStorage.getLengthOfTheArray(); index++) {
				array[index] = scan.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter the integers only");
			System.exit(0);
		}
		oDataStorage.setUnSortedArray(array);
		scan.close();

		System.out.println("Length of Array :" + oDataStorage.getLengthOfTheArray());
		int unSortedArray[] = oDataStorage.getUnSortedArray();
		System.out.print("Unsorted array :");
		for (int index1 = 0; index1 < unSortedArray.length; index1++)
			System.out.print(unSortedArray[index1] + " ");
	}

	void sortTheArrayInAscendingOrder() {
		int unSortedArray[] = oDataStorage.getUnSortedArray();
		for (int count1 = 0; count1 < unSortedArray.length; count1++) {
			for (int count2 = 0; count2 < unSortedArray.length; count2++) {
				int temp = 0;
				if (unSortedArray[count1] < unSortedArray[count2]) {
					temp = unSortedArray[count1];
					unSortedArray[count1] = unSortedArray[count2];
					unSortedArray[count2] = temp;
				}
			}

		}
		oDataStorage.setArraySortedInAscendingOrder(unSortedArray);
	}

	void sortTheArrayInDescendingOrder() {
		int unSortedArray[] = oDataStorage.getUnSortedArray();
		for (int count1 = 0; count1 < unSortedArray.length; count1++) {
			for (int count2 = 0; count2 < unSortedArray.length; count2++) {
				int temp = 0;
				if (unSortedArray[count1] > unSortedArray[count2]) {
					temp = unSortedArray[count1];
					unSortedArray[count1] = unSortedArray[count2];
					unSortedArray[count2] = temp;
				}
			}

		}
		oDataStorage.setArraySortedInDescendingOrder(unSortedArray);

	}

	void displayTheArraySortedInAscendingOrder() {
		int array1[] = oDataStorage.getArraySortedInAscendingOrder();
		System.out.print("\nAscending Order :");
		for (int iterator = 0; iterator < array1.length; iterator++)
			System.out.print(array1[iterator] + " ");

	}

	void displayTheArraySortedInDescendingOrder() {
		int array1[] = oDataStorage.getArraySortedInDescendingOrder();
		System.out.print("\nDescending Order :");
		for (int iterator = 0; iterator < array1.length; iterator++)
			System.out.print(array1[iterator] + " ");

	}

}
