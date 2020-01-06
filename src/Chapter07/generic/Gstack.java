package Chapter07.generic;

import java.util.ArrayList;

public class Gstack<T> {
	//stack = first in last out 
	private int top;
	private ArrayList<T> stack;
	private int size;
	
	public Gstack() {
		top = -1;
		size = 5;
		stack = new ArrayList<>();
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(T item) {
		if(!isFull()) {
			stack.add(++top, item);
		}
	}
	
	
	public T pop() {
		if(!isEmpty()) {
			return stack.get(top--);
		}
		return null;
	}
	
	
}
