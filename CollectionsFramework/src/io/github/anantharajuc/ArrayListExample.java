package io.github.anantharajuc;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		//Creating arraylist  
		ArrayList<String> SlayerBandMembers = new ArrayList<String>();
		
		//Adding object to arraylist  
		SlayerBandMembers.add("Tom Araya");
		SlayerBandMembers.add("Kerry King");
		SlayerBandMembers.add("Jeff Hanneman");
		SlayerBandMembers.add("Dave Lombardo");
		
		//Traversing list through Iterator  
		Iterator Itr = SlayerBandMembers.iterator();
		
		while (Itr.hasNext())
		{
			System.out.println(Itr.next());			
		}
				
		//Traversing list through for-each loop
		for (String BandMembers : SlayerBandMembers)
		{
			System.out.println(BandMembers);  
		}
	}
}
