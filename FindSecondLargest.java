package week3.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(6);
		num.add(7);
		num.add(12);
		num.add(5);
		int size= num.size();
		int sl = size-2;
		
		System.out.println(num);
		//after sorting
		Collections.sort(num);
		System.out.println(num);
		System.out.println("The Second Largest number is:" +num.get(sl));
		
		
		
		
	}

}
