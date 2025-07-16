import java.util.Stack;
import java.util.Scanner;

public class QueueFromStack {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	public void enqueue(int x) {
		while(!s1.isEmpty()) {
			s2.push(s1.peek());
			s1.pop();
		}
		
		s1.push(x);
		
		while(!s2.isEmpty()) {
			s1.push(s2.peek());
			s2.pop();
		}
	}
	
	public int dequeue() {
		if(s1.isEmpty()) {
			return -1;
		}
		int x = s1.peek();
		System.out.println(s1.peek());
		s1.pop();
		return x;
	}
	
	public int poll() {
		System.out.println(s1.peek());
		return s1.peek();
	}
	
	public boolean empt() {
		return s1.isEmpty();
	}
	
	public static void main(String[] args) {
		QueueFromStack q = new QueueFromStack();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("1. enqueue");
			System.out.println("2. dequeue");
			System.out.println("3. poll");
			System.out.println("4. is empty");
			System.out.println("5. exit");
			n = sc.nextInt();
			if(n == 1) {
				System.out.println("enter the value");
				int a = sc.nextInt();
				q.enqueue(a);
			}else if( n == 2) {
				q.dequeue();
			}else if(n == 3) {
				q.poll();
			}else if(n == 4) {
				System.out.println(q.empt());
			}
		}while (n != 5)	;	
	}
}
