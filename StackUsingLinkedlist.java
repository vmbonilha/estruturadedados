import static java.lang.System.exit;

class StackUsingLinkedlist {

	private class Node {

		int data;
		Node link;
	}

	// create global top reference variable global
	Node top;

	// Constructor
	StackUsingLinkedlist() {
		this.top = null;
	}

	public void push(int x) {
		Node temp = new Node();
		temp.data = x;
		temp.link = top;
		top = temp;
	}

	// Utility function to check if the stack is empty or not
	public boolean isEmpty() {
		return top == null;
	}

	// Utility function to return top element in a stack
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Utility function to pop top element from the stack
	public void pop()
	{
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		top = (top).link;
	}

	public void display() {
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.printf("%d->", temp.data);

				// assign temp link to temp
				temp = temp.link;
			}
		}
	}
}