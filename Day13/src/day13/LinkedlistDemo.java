package day13;
import java.util.*;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> h = new LinkedList<>();
		h.add(3);
		h.add(56);
		h.add(8);
		h.add(90);
		h.add(765);
		
		
		System.out.println(h);
		
		h.addFirst(56);
		System.out.println(h);
		
		h.addLast(444);
		System.out.println(h);
		
		h.set(3,5555);
		System.out.println(h);
	}

}
