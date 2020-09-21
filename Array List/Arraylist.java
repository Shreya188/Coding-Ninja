package arralist;

import java.util.ArrayList;

public class ArratListDemo {
	
	

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(10);
		list1.add(15);
		list1.add(20);
		list1.add(1, 50);               //adds a number
		//for each loop iterates through element not index(for loop)
		//it is used for quick traversing
		//it cannot be used to make changes
		for(int elem : list1) {
			System.out.print(elem+" ");
			elem=100;//no change
		}
		
		System.out.println();
		
		
		list1.set(0, 2);                  //over writes a number
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("size is: "+list1.size());
		
	System.out.println(list1.get(2));

	}

}
