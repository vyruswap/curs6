package curs6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex3 {
	public static void main(String[] args) {
		
		String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };

		//varianta1 for in for
		for (int i = 0; i < myStringArray.length; i++) {
			for (int j = i + 1; j < myStringArray.length; j++) {
				if (myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat: " + myStringArray[j]);
				}
			}
		}

		//varianta2 cu HashSet
		Set<String> store = new HashSet<>();
        for (String name : myStringArray) {
            if (store.add(name) == false) {
                System.out.println("Nume duplicat: " + name);
            }
        }
		
		//varianta3 hashTable
        Map<String, Integer> nameAndCount = new HashMap<>();

        for (String name : myStringArray) {
            Integer count = nameAndCount.get(name);
            if (count == null) {
                nameAndCount.put(name, 1);
            } else {
                nameAndCount.put(name, ++count);
            }
        }
        
        Set<Entry<String, Integer>> entrySet = nameAndCount.entrySet();
        for (Entry<String, Integer> entry : entrySet) {

            if (entry.getValue() > 1) {
                System.out.println("Nume duplicat: " + entry.getKey());
            }
        }
	}
}
