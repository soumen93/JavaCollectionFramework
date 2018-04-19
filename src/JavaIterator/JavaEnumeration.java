package JavaIterator;
import java.util.Enumeration;
import java.util.Vector;

//Java enumeration used to use to retrived data from legacy java collection data structure i.e. vector and Hastable
//This is only used in legacy java collection DS.
//This can only be used to retrive data. this cannot delete data. This is like a forward iterating process
public class JavaEnumeration {
  public static void main(String[] args) {
	  Vector<Integer> vector=new Vector();
	  for(int i=0;i<10;i++) {
		  vector.add(i);
	  }
	  
	  //creating an enumeration of the vector object using ".elements()";
	  Enumeration enumeration=vector.elements();
	  
	  //hasMoreElements() throws "no such Element" exception if there is no element present in the vector or in the collection 
	  while(enumeration.hasMoreElements()) {
		  System.out.println(enumeration.nextElement());
	  }
	  
  }
}
