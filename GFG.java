public class GFG { 
	public static void main(String[] args) 
	{ 
		StackUsingLinkedlist obj = new StackUsingLinkedlist(); 
		obj.push(1); 
		obj.push(2); 
		obj.push(3); 
        obj.push(4);
        obj.push(5);

		// print Stack elements 
		obj.display(); 

		// print Top element of Stack 
		System.out.printf("\nTop element is %d\n", obj.peek()); 

		// Delete top element of Stack 
		obj.pop(); 
		obj.pop(); 

		// print Stack elements 
		obj.display(); 

		// print Top element of Stack 
		System.out.printf("\nTop element is %d\n", obj.peek()); 
	} 
} 