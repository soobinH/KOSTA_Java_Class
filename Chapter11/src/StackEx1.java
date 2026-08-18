import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Person> st = new Stack<>();
		st.push(new Person(30,"qong"));
		st.push(new Person(40,"aong"));
		st.push(new Person(100,"torng"));
		st.push(new Person(300,"qyong"));
		st.push(new Person(400,"uaong"));
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println(st);
	}

}
