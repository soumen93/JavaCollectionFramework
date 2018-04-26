package JavaMapInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author I332330
 * Java HashMap is used to store {K,V} pair. few important feature of hashMap is -->
 *    i)HashMap use hashing technique internally that's why it is called hashMap. when you add a key in the 
 *      hashMap it converts the Key value into a 'hashcode' and store it in particular bucket.
 *   
 *   ii)In hashMap each "bucket" is contains these entries {hashcode,key,value,referenceToTheNextNode} where
 *       'hashcode' of each key calculated by the 'hashFunction' and 'referenceToTheNextNode' used to itearate
 *        thorugh the hashMap.
 *  
 *  iii)HashMap deafult size is 16 and loadfactor is 0.75. where it double it's size when it reach the loadfactor
 *      value.
 *  
 *  iv)In HashMap you can store NULL as a key. But only one "NULL" key you can store. but you can store more than
 *      one "NULL" values. IN hashMap one key can contain more than one different "value". but you need to
 *      store them porperly (arraylist of values can be used) otherwise first value will get override by the
 *      next value        
 *  
 *  v)HashMap best case time complexity for get() and put() call is O(1). but it wrost case condition it is
 *     O(n).
 *    
 *  vi)HashMap is not synchronized to make it synchronized we need to use "Collections.synchronized(map)". 
 *  
 *  vii) Though HashMap doesn't maintain any order of data insertion
 */
public class JavaHashMap {
   public static void main(String[] args) {
	   //create an hashMap with the daefualt size.
	   HashMap<String,Integer> hashMap=new HashMap();
	   
	   //add element to the hashMap
	   hashMap.put("One",1);
	   hashMap.put("TWO",2);
	   hashMap.put("THREE",3);
	   
	   //print the value if key "TWO" exists in the hashMap
	   if(hashMap.containsKey("TWO")) {
		   System.out.println("The value of the key 'TWO' is: " +hashMap.get("TWO"));
	   }
	   
	   //print the size and capacity of the hashMap
	   System.out.println("Size of the hashMap is: "+hashMap.size());
	   
	   //remove the entry "TWO" from the hashMap
	   hashMap.remove("TWO");
	   
	   //print the HashMap
	   System.out.println("The hashMap is: " +hashMap);
	   
	   //print the keySet values in hashMap using "KeySet()"
	   Set<String> set=hashMap.keySet();
	   System.out.println("Key Set values of the hashMap is: "+set);
	   
	   //print the value set present in the hasMap using "values()"
	   Collection<Integer> valueSet=(Collection<Integer>) hashMap.values();
	   System.out.println("Value set of the hashMap is: "+valueSet);
   }
}
