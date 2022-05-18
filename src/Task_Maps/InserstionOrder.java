package Task_Maps;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class InserstionOrder {

	void hashmap() {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details");
		try {

			hashmap.put(scan.nextInt(), scan.next());
			hashmap.put(scan.nextInt(), scan.next());
			hashmap.put(scan.nextInt(), scan.next());
			hashmap.put(scan.nextInt(), scan.next());
			hashmap.put(scan.nextInt(), scan.next());
			scan.close();
		} catch (InputMismatchException exception) {

			System.out.println("Enter the valid input ");

		}
		System.out.println("Details" + hashmap);
		System.out.println(hashmap.remove(102));
		System.out.println(hashmap);
		System.out.println(hashmap.containsKey(101));
		System.out.println(hashmap.containsValue("akshiya"));
		System.out.println(hashmap.isEmpty());
		System.out.println(hashmap.keySet()); // return all the keys as set*/
		for (Object number : hashmap.keySet()) {
			System.out.println(number + "      " + hashmap.get(number));

		}

	}

	void linkedHashMap() {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(101, "Akshiya");
		map.put(102, "jeni");
		map.put(108, "sam");
		map.put(106, "sandra");
		map.put(104, "vishal");

		System.out.println("Linked Hash Map Insertion:" + map);

	}

	void treeMap() {
		try {
			TreeMap<Integer, String> map = new TreeMap<Integer, String>();

			map.put(101, "Akshiya");
			map.put(102, "sam");
			map.put(103, "vishal");
			map.put(104, "sridhar");
			map.put(105, "jeni");

			for (Entry<Integer, String> iterate : map.entrySet()) {
				System.out.println(iterate.getKey() + "  " + iterate.getValue());
			}

			System.out.println("Print values in Descending order : ");

			NavigableMap<Integer, String> reverse = map.descendingMap();
			System.out.println(reverse);

		} catch (Exception exception) {
			System.out.println("NullPointerException: Null value not allowed in treeMap ");
		}

	}
}
