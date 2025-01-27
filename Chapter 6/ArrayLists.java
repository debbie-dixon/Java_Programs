import java.util.ArrayList;

public class ArrayLists {
	public static void main (String args[]){
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Henry");
		list.add("Mary");
		list.add("Jack");
		list.add("Blessing");
		
		list.add(2, "CLinton"); //add element at a partcular index
		
		list.remove(1); //or by element name... to remove an element from an array list
		list.remove("Jack");
		//list.clear();
		list.set(3, "Peter");
		System.out.println(list.get(3));
		
		//for (String name : list) {
			//System.out.println(name);
		//}
		
		System.out.printf("%s%n", list);
		
	}
}