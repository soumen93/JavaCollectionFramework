import java.util.Hashtable;
import java.util.Vector;

/**
 * in java before collection framework introduced there were three collection DS available i.e.
 * i)Array
 * ii)Vector
 * iii)Hashtable
 * @author I332330
 *
 */
public class LegacyJavaCollection {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		Vector vector=new Vector();
		Hashtable<String,Integer> hashTable=new Hashtable<String,Integer>();
		
		//adding element to the vector, you can add different data type data to vector
		vector.add(1);
		vector.add("2");
		vector.add(3);
		
		//adding value to the Hashtable
		hashTable.put("one", 1);
		hashTable.put("two", 2);
		hashTable.put("three", 3);
		
		//retrive from array
		System.out.println(array[0]);
		
		//retrive from vector
		System.out.println(vector.get(1));
		
		//retrive from array
		System.out.println(hashTable.get("one"));
	}

}
