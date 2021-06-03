import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		
		 ArrayList list = new ArrayList(); 
		 list.add("Apple"); 
		 list.add(123);
		 list.add(123.456); 
		 list.add(new Date()); 
		 list.add("Mango");
		 list.add("Orange"); 
		 list.add(321);
		 for(int i =0; i < list.size(); i++) { System.out.println(list.get(i)); }
		
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apples");
		fruits.add("Mangoes");
		fruits.add("Oranges");
		for(int i =0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i).toUpperCase());
		}
	}
}