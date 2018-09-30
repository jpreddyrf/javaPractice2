package CollectionSessions;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPract {

	
	@SuppressWarnings("unused")
	public static <E> void main(String[] args) {
		//static array
		System.out.println("Static Array concepet");
		int a[] =new int[10];
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		a[0]=0;
		
		System.out.println(a.length);
		for (int i=0; i<a.length; i++){
			System.out.println(a[i]);
			//a[i+2]= a[i]+a[i+1];
						
		}
		System.out.println("____________________________ Dynamic Array");
		// Dynamic array 
		//1. it accepts duplicate values
		//2. Maintains Insertion Order
		//3. Not synchronized/not thread safe (slow)
		//4. it allow you Random Access to fetch the value because it stores the values in the basis of Index
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> ar = new ArrayList<Comparable>();
		ar.add(10);
		ar.add("Selenium");
		ar.add(200);
		ar.add(200);
		ar.add(true);
		ar.add("A");
		System.out.println("size of the ArrayList Array is :"+ar.size());
		
				// To print the all values/ elements from arraylist
				//1. Using for loop
				//2. Iterator
		
		for (int i=0; i< ar.size(); i++){
			System.out.println(ar.get(i));
			
		}
		
		//Non generic (Store any type values) and generic (Store Specific type values)
		
		System.out.println("____________________________ Generic Arrays");
		ArrayList<Integer> ar1= new ArrayList<Integer>(); // generic
		ar1.add(20);
		//ar1.add("Selenium"); not accept :error b/c only Integer values will store in ar1 array
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Selenium using Java");
		//ar2.addAll(20);
		ar2.add("Test");
		
		//ArrayList<E> ar3= new ArrayList<E>();
		
		
		
		//------------------
		System.out.println("____________________________Employee Constructor objects array");
		Employee e1= new Employee("Naveen",40,"Qtp");
		Employee e2= new Employee("Shiva",35,"Dev");
		Employee e3= new Employee("Giri",38,"admin");
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse values
		Iterator<Employee> it =ar4.iterator();
		
		while(it.hasNext()){
			Employee emp =it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dep);
		}
		
		//*********************************************
		
		//addAll(Collection C) Method
		
		System.out.println("____________________________Add All Method");
		
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("Selenium");
		ar5.add("Test");
		ar5.add("Java");
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("QA");
		ar6.add("Test");
		ar6.add("Qtp");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++){
			
			System.out.println(ar5.get(i));
			
		}
		
		// removeAll(Collection c)-- Removing values
		System.out.println("____________________________RemoveAll Method");
		ar5.removeAll(ar6);
		
		for(int i=0; i<ar5.size(); i++){
			
			System.out.println(ar5.get(i));
			
		}
		
		
		// retainAll(Collection C) ---- Retain common values in two collections
		System.out.println("____________________________Retain values from two arryLists");
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("Selenium");
		ar7.add("Java");
		ar7.add("Test");
		
		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Qtp");
		
		ar7.retainAll(ar8);
		
		for(int i=0; i<ar7.size(); i++){
			System.out.println(ar7.get(i));
			
		}
		
		
		
	}

}
