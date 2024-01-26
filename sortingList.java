package week3.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class sortingList {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		
		name.add("HCL");
		name.add("Wipro");
		name.add("Aspire Systems");
		name.add("CTS");
		
		System.out.println(name);
		
		//After Sorting
		Collections.sort(name);
		System.out.println(name);
		
		//Display one by one
		int size=name.size();
		int z= size-1;
		for(int i=0;i<size;i++)
		{
			System.out.println(name.get(i));
		}
		//System.out.println(name.get(3));
		
		//reverse the array
		for(int j=z;j>=0;j--)
		{
			System.out.println(name.get(j));
		}
		
		
		
	}

}
