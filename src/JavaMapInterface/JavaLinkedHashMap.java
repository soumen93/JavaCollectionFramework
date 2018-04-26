package JavaMapInterface;

import java.util.LinkedHashMap;

/**
 * @author I332330
 *Linked HashMap actually extends the hashMap class.
 *  i)LinkedHashMap can performs all the all the operation that one hashMap can do only difference is
 *    LinkedHashMap maintains the key insertion order where hashMap doesn't maintain any order. 
 */

public class JavaLinkedHashMap {

	public static void main(String[] args) {
		//creating a linkedHasMap  
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<String,Integer>();
		
		//adding keys to it
		linkedHashMap.put("One", 1);
		linkedHashMap.put("two", 2);
		linkedHashMap.put("three",3);
		linkedHashMap.put("four", 4);
		
		//printing the list, observe it is printing in ordered way.
		System.out.println("Printing the linkedHashMap:  " +linkedHashMap);
		   
	}

}
