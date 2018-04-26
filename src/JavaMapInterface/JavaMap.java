package JavaMapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author I332330
 * Java Map doesn't implements the collections interface it use the 'Map' interface. So it behaves little bit
 * differently compare to other collection data structure
 * First of all map is a {key,value} pair.
 * 
 * i) In a Map all the key should be unique and it atmost linked to one value
 * ii)some map allows to store null value(hashMap,linkedHashMap) or not(TreeMap).
 * iii)in Map you can use 'entrySet' to traverse the map. 
 */

public class JavaMap {
	public static void main(String[] args) {
		//creating a map object of the type hashMap
		HashMap<String,Integer> hashmap=new HashMap<>();
		
		//adding value to the map
		hashmap.put("One", 1);
		hashmap.put("Two",2);
		hashmap.put("Three",3);
		hashmap.put("Four",4);
		hashmap.put("Five",5);
		hashmap.put("TWO",6);
		
		//create a entry set to traverse the map
		Set<Map.Entry<String,Integer>> sets=hashmap.entrySet();
		
		//printing all the elements of the map
		for(Map.Entry<String, Integer> set: sets) {
			System.out.println("the key and value pair is:  " +set.getKey()+"-->"+set.getValue());
		}
		
		//System.out.println(hashmap.get("TWO"));
	}
}
