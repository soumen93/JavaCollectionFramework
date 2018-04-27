package JavaMapInterface;

import java.util.TreeMap;

import javax.swing.event.TreeExpansionEvent;

/**
 * @author I332330
 * Java TreeMap use 'sorted Map' interface which is child of 'Map' interface.
 *    i)TreeMap is important when you want to store unique elements in sorted order.
 *       if you want your own custom sorting algo then you can pass your own comparator 
 */
public class JavaTreeMap {

	public static void main(String[] args) {
		//creating a treeMap object
		TreeMap<Integer,String> treeMap=new TreeMap<>();
		
		//adding element to the treeMap
		treeMap.put(1,"One");
		treeMap.put(5,"Five");
		treeMap.put(4,"Four");
		treeMap.put(2,"Two");
		treeMap.put(3,"Three");
		
		//printing the treeMap, observer it is in sorted order
		System.out.println("Printing the TreeMap: "+treeMap);
		
		//present the value of key "3" if it is present in the treeSet
		if(treeMap.containsKey(3)) {
			System.out.println("The value of the key '3' is : "+treeMap.get(3));
		}
		
		//printing the size of the list
		System.out.println("size of the list is:" +treeMap.size());
		
		//remove the key 2 from the list.
		treeMap.remove(2);
		
		//printing the TreeMap in sorted order
		System.out.println("Latest TreeMap is: "+treeMap);
	
	}

}
