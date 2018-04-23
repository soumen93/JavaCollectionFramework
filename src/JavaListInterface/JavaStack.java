package JavaListInterface;

import java.util.Iterator;
import java.util.Stack;

/**
 * 
 * @author I332330
 *Java stack serve the purpose of stack data structure i.e. last in first out(LIFO).
 *it's internally extends the vector and use it's five method using that it works as a stack
 *default size of the stack is 10 as well.
 */
public class JavaStack {
	public static void main(String[] args) {
		Stack stack=new Stack();
		
		//adding element to the stack i.e. push() to the stack
		for(int i=0;i<6;i++) {
			stack.push(i);
		}
		
		//adding one element to the top of the stack
		stack.push(6);
		
		printStack(stack);
		
		//removing topmost elements of the stack using pop()
		for(int i=0;i<3;i++) {
			int popedElement=(Integer)stack.pop();
			System.out.println("The poped element is: "+popedElement);
		}
		
		//retreveing the top element but not removing it from the list using peek()
		for(int i=0;i<3;i++) {
			int popedElement=(Integer)stack.peek();
			System.out.println("The poped element is: "+popedElement);
		}
		
		//printing the size of the stack
		System.out.println("size of the list is: " +stack.size());
		
		//printing the capacity of the stack
		System.out.println("Capacity of the stack: "+stack.capacity());
	}
	
	private  static void printStack(Stack stack) {
		//print the stack using iterator.
		Iterator iterator=stack.iterator();
		System.out.println();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
