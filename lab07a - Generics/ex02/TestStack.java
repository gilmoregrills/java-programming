
public class TestStack {
	public static void main(String[] args) {
		Stack<String> str = new Stack<String>();
		Stack<Integer> ints = new Stack<Integer>();
		Stack<Boolean> bools = new Stack<Boolean>();
		//push method used to add items to stack
		//pop method used to print the last item added
		str.push("Pardon");
		System.out.println(str.pop()+" added to Stack str");
		str.push("me");
		System.out.println(str.pop()+" added to Stack str");
		str.push("are");
		System.out.println(str.pop()+" added to Stack str");
		str.push("you");
		System.out.println(str.pop()+" added to Stack str");

		ints.push(1);
		System.out.println(ints.pop()+" added to Stack ints");
		ints.push(2);
		System.out.println(ints.pop()+" added to Stack ints");
		ints.push(3);
		System.out.println(ints.pop()+" added to Stack ints");
		ints.push(4);
		System.out.println(ints.pop()+" added to Stack ints");

		bools.push(true);
		System.out.println(bools.pop()+" added to Stack bools");
		bools.push(false);
		System.out.println(bools.pop()+" added to Stack bools");
		bools.push(true);
		System.out.println(bools.pop()+" added to Stack bools");
	}
}
