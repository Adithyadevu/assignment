package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("blue");
		obj.add("green");
		obj.add("yellow");
		obj.add("purple");
		obj.add("black");
		System.out.println(obj);//print the collection
		
		
		System.out.println(obj.get(1));//retrieve an element
		
		
		Iterator <String> i=obj.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());//iterate through all element
		}
		
		
	    obj.remove("purple");
		System.out.println(obj);//to remove third element in array list
		
		
		boolean a=obj.contains("green");//search an element in arraylist(true)
		System.out.println(a);
		boolean b=obj.contains("pink");//search an element in arraylist(false)
		System.out.println(b);
	}

}
