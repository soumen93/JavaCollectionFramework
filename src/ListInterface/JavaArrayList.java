package ListInterface;

import java.util.ArrayList;

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
	public static void main() {
		//creating a dynamic arrayList
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		//adding element to the arrayList
		for(int i=0;i<5;i++) {
			arrayList.add(i);
		}
	}
}
