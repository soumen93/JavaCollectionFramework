package JavaListInterface;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * @author I332330
 * This is very similiar like Java ArrayList with few differences i.e.
 *    i)vector is thread safe hence performance wise it is little bit slower compare to ArrayList
 *   ii)default size is 10 and grow 100% from it's current size when it grow.
 *  iii)You can use both Iterator and Enumerator to traverse the list.
 *   iv)you can mentioned the growing factor too in a vector. 
 *   v)You can s
 */
public class JavaVector {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		for(int i=0;i<6;i++) {
			arrayList.add(i);
		}
		
		//creating an vector object
		Vector vector=new Vector();
		vector.addAll(arrayList);
		
		//printing vector in string format
		System.out.println("vector in string fromat: " +vector.toString());
		
		//adding element in the vector in a particular index
		vector.add(6,"last");
		vector.insertElementAt("first", 0);;
		
		//getting size of the vector
		System.out.println("Size of the vcetor is: "+vector.size());
		
		//print the capacity of the vector
		System.out.println("Capacity of the vector: " +vector.capacity());
		
		//shrink the vector size to the current size
		vector.trimToSize();
		
		//print the element of the vector using enumerator
		Enumeration enumeration=vector.elements();
		System.out.println();
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+" ");
		}
		System.out.println();
		
	}
}
