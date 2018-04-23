package JavaListInterface;

import java.util.LinkedList;

public class JavaLinkedList {
  public static void main(String[] args) {
	  //creating a linkedlist instance
	  LinkedList<String> linkedList=new LinkedList<>();
	  
	  //add an element to the linkedlist
	  linkedList.add("b");
	  
	  //add an element to the first location of the linkedlist
	  linkedList.addFirst("a");
	  
	  //add an element to the end of the linkedlist
	  linkedList.addLast("d");
	  
	  //add an element to any location of the linkedlist
	  linkedList.add(2, "c");
	  
	  System.out.println(linkedList);
	  
	  //check if the element is present in the linkedlist or not
	  boolean isPresent=linkedList.contains("a");
	  System.out.println("Is 'a' present in the linkedList: " +isPresent);
	  isPresent=linkedList.contains("f");
	  System.out.println("Is 'f' present in the linkedList" +isPresent);
	  
	  //get the index of a element in the list
	  int index=linkedList.indexOf("c");
	  System.out.println("Index of 'f' in the list is" +index);
	  
	  //get an elemnt of a particular index
	  String element=linkedList.get(3);
	  System.out.println("Element present in the index 3 is: " +element);
	  
	  //get the size of the list
	  int size=linkedList.size();
	  System.out.println("size of the linked list is: "+size);
	  
	  //remove one element from the list
	  linkedList.remove("d");
	  
	  System.out.println(linkedList);
	  
  }
}
