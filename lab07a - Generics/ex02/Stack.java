import java.util.*;

public class Stack<T> {
	private T t;
	private ArrayList<T> stack = new ArrayList<T>();	

	public void push(T t) {
		stack.add(t);	
	}

	public T pop() {
		return stack.get(stack.size() - 1);
	}
}
