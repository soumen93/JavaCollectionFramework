package JavaSetInterface;

import java.util.TreeSet;

/**
 * @author I332330
 * TreeSet is an sorted unordered set which actually implements the 'sortedSet' interface.
 *   i)Treeset doesn't contain duplicate and hetarogenous type of element (it will throw class cast exception)
 *   
 *  ii)TreeSet doesn't maintain the order in which the element are inserted in the set but it does sort the element
 *      based on the key value.
 *      
 * iii)Treeset actaully a self balanced binary tree like Red-back tree. so all add() and remove() takes O(logn)
 *     time complexity. but seraching takes O(n) time as it needs to sort the element.
 *     
 * iv)TreeSet is not thread-safe. to make it thread-safe you need to use "collections.synchronozed(treeset);"
 *  
 * v) you can pass you custom comparator instance if you want to sort the treeset on a particular parameter.
 * 
 * vi)TreeSet doesn't allow to insert "NULL" value. it will throw NPE as it needs to compare "NULL" with other element   
 */
public class JavaTreeSet {
	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<>();
		
		//add element
		treeSet.add("KKR");
		treeSet.add("CSk");
		treeSet.add("DD");
		treeSet.add("RR");
		treeSet.add("MI");
		treeSet.add("Punjab");
		treeSet.add("KKR");
		
		//printing the treeSet element, you can observer they are already in sorted order
		System.out.println("printing the treeset:"+treeSet);
		
		//printing the first element in the list which is actually first element in sorted order.
		System.out.println("first elemnt in the treeset in terms of sorting: "+treeSet.first());
		
		//printing the last element in the list which is actually last element in sorted order.
		System.out.println("first last in the treeset in terms of sorting: "+treeSet.last());
		
		//printing elements present before "P"
		System.out.println("Elements present before 'P': "+treeSet.headSet("P"));
		
		//printing elements present after "P"
	    System.out.println("Elements present after 'P': "+treeSet.tailSet("P"));
	    
	    //printing the size of the treeset
	    System.out.println("The size of the treeset: "+treeSet.size());
	}
}
