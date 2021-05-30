import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Stack과 Queue

public class ex02 {

	public static void main(String[] args) {
		Stack st = new Stack(); //Stack은 클래스
		Queue q = new LinkedList(); //Queue는 인터페이스, Queue인터페이스 구현체인 LinkedList
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=Stack=");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("=Queue=");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
