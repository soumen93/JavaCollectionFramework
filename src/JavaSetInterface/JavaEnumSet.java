package JavaSetInterface;

import java.util.EnumSet;

/**
 * @author I332330
 *Java EnumSet is usually use to store enumtype.
 * i)it is not synchronized and can only store enum of a single enum type.
 * ii)it is usually use to traverse or retrieve the enum form a set of enum and it is very faster than
 *    compare to hashSet
 * iii)As enum don't allow you to store duplicate data so there is not chance to store duplicate data in 
 *     an enumSet   
 */
public class JavaEnumSet {
  enum team{
	  KKR, CSK,DD, MI,SRH,KXIP,RCB,RR
  };
  
  public static void main(String[] args) {
	  EnumSet<team> all,firstFour,lastFour;
	  
	  //adding all elements to enumset all
	  all=EnumSet.allOf(team.class);
	  
	  //adding element mentioing the range of elemtn in enum
	  lastFour=EnumSet.range(team.SRH,team.RR);
	  
	  //adding all the elemnts which is not present in the lastFoor enumset
	  firstFour=EnumSet.complementOf(lastFour);
	  
	  //printing all the enum set one by one
	  System.out.println("Enum conating all the element: "+all);
	  System.out.println("Enum containg last four team  name: "+lastFour);
	  System.out.println("Enum containg other teams except last four: " +firstFour);
	  
	  
	  
  }
}
