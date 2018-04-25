package JavaSetInterface;

import java.util.LinkedHashSet;

/**
 * @author I332330
 *i)Java linkedHashSet is like a ordered hashset. In HashSet we don't maintain the order of the element
 *   inserted but in linkedHashSet , it maintain the order in which the elements are inserted in the set.
 * 
 * ii)But it will not contain any duplicate data as it is implementing the set interface
 * 
 * iii)The difference between LinkedHashMap and LinkedHashSet is, LinkedHashMap use map as it's internal data
 *     structure but linkedHashSet use hashset as it's internal data structure  
 *
 */
public class JavaLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		
		//adding element to the linkedHashSet
		linkedHashSet.add("KKR");
		linkedHashSet.add("CSK");
		linkedHashSet.add("SRH");
		linkedHashSet.add("RCB");
		linkedHashSet.add("RR");
		linkedHashSet.add("KXIP");
		linkedHashSet.add("KKR");
		
		//printing the size of the linkedHashSet
		System.out.println("The size of the linkedHashSet: "+linkedHashSet.size());
		
		//removing the element form the linkedHashSet
		System.out.println("removing 'CSK' from the linkedHashSet: "+linkedHashSet.remove("RR"));
		System.out.println("removing 'DD' from the linkedHashSet: "+linkedHashSet.remove("DD"));
		
		//checking if the element is present in the linkedHaset or not
		System.out.println("IS 'kkr' present in the list:" +linkedHashSet.contains("KKR"));
		
		//printing the linkedHashset
		System.out.println("the linkedHashSet item is\n:"+linkedHashSet);
	}
}
