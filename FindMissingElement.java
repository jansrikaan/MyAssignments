package week3.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class FindMissingElement {
	public static void main(String[] args) {
		ArrayList<Integer> nos = new ArrayList<Integer>(10);
		
		nos.add(1);
		nos.add(2);
		nos.add(3);
		nos.add(5);
		nos.add(10);
		nos.add(6);
		nos.add(8);
		Collections.sort(nos);		
		int size= nos.size();
		
		
		for(int i=0;i<size;i++)
		{
			int j = i+1;
			if(j-i==1)
			{
		System.out.println(nos.get(i));
			}
			//else
				//System.out.println(nos.get(j));
		}
		
	}

}
