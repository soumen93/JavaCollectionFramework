package JavaIterator;

import java.util.ArrayList;

/**
 * 
 * @author I332330
 *Iterator is used to retrieve and remove elements from any java collection and from map interface too
 *But Iterator iterate forward way not and it can modify/add any element in the collection 
 */
public class Iterator {
  public static void main(String[] args) {
	  ArrayList<Integer> arrayList=new ArrayList<>();
	  for(int i=0;i<10;i++) {
		  arrayList.add(i);
	  }
	  
	  //creating an iterator to retrieve data from the arraylist
	  //Initially iterator will point to just before the starting point of the arrayList
	  java.util.Iterator<Integer> iterator=arrayList.iterator();
	  
	  //traversing the arraylist iterator using hasNext()
	  while(iterator.hasNext()) {
		  //retrieving data using next()
		  int i=iterator.next();
		  System.out.println(i);
		  
		  //using iterator removing the even element from the ArrayList
		  if(i%2==0) {
			  iterator.remove();
		  }
	  }
	 
	  //list only containing the odd elements
	 System.out.println(arrayList);
  }
}
