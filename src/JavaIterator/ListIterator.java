package JavaIterator;

import java.util.ArrayList;

/**
 * Java ListIterator used to retrieve data from listCollection like Arraylist, Linkedlist etc.
 * It has few more capabilities other than traversing forward and removing element from the List 
 * i.e. hasPrevious(), previous(),previousIndex(),set(),add() 
 * @author I332330
 *
 */

/**
 * Enumerator,Iterator, ListIterator doesn't crate any object using .element(),.Iterator(),.ListIterator() method.
 * This actually call .hasNext(), .next() etc. method which actually creating object using its inner class implementation 
 * @author I332330
 *
 */
public class ListIterator {
	public static void main(String args[]) {
		ArrayList<Integer> arraylist=new ArrayList<>();
		for(int i=0;i<10;i++) {
			arraylist.add(i);
		}
		
		System.out.println("Originalist\n"+arraylist);
		System.out.println();
		
		//creating an ListIterator for the arrayList
		java.util.ListIterator<Integer> listIterator=arraylist.listIterator();
		
		//traversing the arraylist using the listIterator
		while(listIterator.hasNext()) {
			int i=listIterator.next();
			System.out.print(i+" ");
			
			if(i%2==0) {
				i++;
				
				//set() set the value of the element return by the next()
				listIterator.set(i);
				
				//add(), method add the new element just after the element returned by next()
				listIterator.add(i);
			}
		}
		System.out.println("\n modfied arralist, modified using listIterator set() and add() method ");
		System.out.println(arraylist);
		
	}

}
