package JavaListInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

/**
 * ListInterface provide to create a list of collection data which stores data in ordered collection of objects 
 * which can be stored duplicate objects.
 * There are different listObjects which can be created (using list interface internally) i.e.
 * i)Arraylist
 * ii)Linkedlist
 * iii)Vector 
 * Using Java generic you can stored generic types of data in different list 
 * @author soume
 *
 */

/**
 * List cannot store primitive data types like int,char,double. 
 * you need to use wrapper class to store those primitive types of data 
 * @author soume
 *
 */
public class JavaArrayList {
	/**
	 * i)Java ArrayList is not thread safe. Hence it is not thread safe so performance wise performance wise 
	 *   it is faster than vector.
	 * ii)default size of Java Arraylist is 10. and it is grow 50% every time it reaches it's current size limit.
	 * iii)ArrayList you can't define the list growing factor.  
	 * iv)This can be only traverse using iterator. you can not use enumeration here 
	 * @param args
	 */
	public static void main(String[] args) {
		//creating a dynamic arrayList
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		//adding element to the arrayList
		arrayList.add(7);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(6);
		arrayList.add(4);
		System.out.println("Original arrayList: "+arrayList);
		
		//add an element at the end of the Arraylist
		arrayList.add(5);
		System.out.println("Arrylist after adding 5 at the end of the list: " +arrayList);
		
		//sort the ArrayList in asending order
		AsendComparator asendComparator=new AsendComparator();
		Collections.sort(arrayList, asendComparator);
		System.out.println("ArrayList after sorting the lst in asending order: "+arrayList);
		
		//reverse the arraylist
		Collections.reverse(arrayList);
		System.out.println("After reversing the list: " +arrayList);
		
		//size of the arraylist
		int size=arrayList.size();
		System.out.println("size of the list is: "+size);
		
		//space separateted value of the list
		System.out.print("Space separted value of the list is: ");
		ListIterator listIterator=arrayList.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		//sort the list in desending order
		DesendComparator desendComparator= new DesendComparator();
		Collections.sort(arrayList, desendComparator);
		System.out.println("arralist sorted in desending order: " +arrayList);
		
	}	
		
}

class AsendComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		// TODO Auto-generated method stub
		if(num1>num2) {
			return 1;
		}else if(num1<num2){
			return -1;
		}
		else {
			return 0;
		}
	}
}

class DesendComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		if(num1<num2) {
			return 1;
		}else if(num1>num2) {
			return -1;
		}
		return 0;
	}
	
}	
