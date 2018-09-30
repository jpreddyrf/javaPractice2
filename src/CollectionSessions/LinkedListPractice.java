package CollectionSessions;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
	
	// Single Linked List
	// Double Linked List
	// Circular Linked List

	public static void main(String[] args) {
		System.out.println("This Class is Linked List Practice");
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RPA");
		ll.add("Test");
		System.out.println("Linked List data"+ll);
		ll.add("Naveen");
		System.out.println("____________________________");
		System.out.println("Linked List data add Naveen"+ll);
		// AddFirst, add the value in Index 0 and shift the existing values to right
		ll.addFirst("Prabhakar");
		System.out.println("Linked List data Add First Prabhakar"+ll);
		//addLast
		ll.addLast("Sudhakar");
		System.out.println("Linked List data Add Last Shdhakar"+ll);
		//add middle using index, adding New value in index and shift the existing values Right
		ll.add(2, "AAAA");
		System.out.println("Linked List data String AAA in Index 2"+ll);
		
		//get
		System.out.println("Linked List data"+ll.get(0));
		
		//Set Replacing the New value in Index
		
		ll.set(0, "Vinayak");
		System.out.println("Linked List data"+ll);
		
		//RemoveFirst, Remove Last, Remove index based,remove(), removeall()
		System.out.println("Linked List data Remove First"+ll.removeFirst());
		System.out.println("Linked List data Remove Last"+ll.removeLast());
		System.out.println("Linked List data Remove Index 2 "+ll.remove(2));
		System.out.println("Linked List data Remove"+ll.remove());
		System.out.println("Linked List data"+ll);
		
		//ll.removeAll(ll);
		// how to print 
		//for Loop
		System.out.println("*************Using For Loop"+ll);
		for(int n=0; n<ll.size();n++){
			System.out.println("Linked List data  "+ll.get(n));
		}
		
		// Advanced for Loop
		
		System.out.println("************Advanced For Loop ");
		for(String str:ll){
			System.out.println("Advanced For Loop "+str);
		}
		// while loop
		System.out.println("******************** While Loop ");
		int n=0;
		while( n< ll.size()){
			
			System.out.println(ll.get(n));
			n++;
			
		}
		
		// iterator
		System.out.println("*********Iterator ");
		Iterator<String> it= ll.iterator();
		while(it.hasNext()){
			String emp=it.next();
			System.out.println(emp);
		}
		System.out.println("Linked List data"+ll);
		
		
	
	}

}
