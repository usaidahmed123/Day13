package day13;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> ir = new Stack<>();
		ir.push("fg");
		ir.push("tripleH");
		ir.push("trio");
		ir.push("dhoni");
		ir.push("messi");
		ir.push("cena");
		
		
		
		System.out.println(ir);
		
		ir.pop();
		System.out.println(ir);
		
		ir.pop();
		System.out.println(ir);
		
		ir.push("cam");
		System.out.println(ir);
		
		ir.pop();
		System.out.println(ir);
		
		ir.pop();
		System.out.println(ir);
		
		ir.pop();
		System.out.println(ir);
		
		ir.pop();
		System.out.println(ir);
		
		ir.peek();
		System.out.println(ir.empty());
		System.out.println(ir.search(ir));
	}

}
