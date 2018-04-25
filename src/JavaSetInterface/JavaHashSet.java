package JavaSetInterface;

import java.util.HashSet;

/**
 * @author I332330
 *Java Hashset is the unordered ways to store data but it doesn't contain duplicate data. though it contains
 *     Null Value.
 *Initial size of hashset is 16. which grow 100% when it reaches the load factor value.
 *Predefined load factor value is 0.75. which can be mentioned while initializing the hashset.
 */

/**
 * HashSet internally use hashMap where the element you pass stored as a "key" and 
 *                                                value it stores is a "fixed" value
 *  
 * As it is using the hashMap as it's internal data structure normal put(), get() opeartion works in O(1).
 * As it also implements the "set" inteface hence you can not store duplicate data here  
 *
 */
public class JavaHashSet {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
		
		//adding element to the hashset
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		
		System.out.println("printing the elemnt of the hashset, where the duplicate value 'A' is present only once: "+hashSet);
		
		//removing the one element from the hashset
		hashSet.remove("D");
		System.out.println("Hashset after removig 'D': "+hashSet);
		
		//check if a object present in hashset or not
		System.out.println("is 'A' present in the hashset: "+hashSet.contains("A"));
		System.out.println("is 'E' present in the hashset:"+hashSet.contains("E"));
		
	}
}
