class Arrays {
	public static void main(String[] args){

		String data [] = new String[5];
		System.out.println(data.super.getClass().getName());
		System.out.println("Enter the no of Elements U want to create:");
		int size = Integer.parseInt(System.console().readLine());//Convert a String to a integer.
		int [] elements = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.println("Enter a number to store in position " + i);
			elements[i] = Integer.parseInt(System.console().readLine());//Take input from the user to add the values to the elements of the array..
		}
		//foreach statement to loop thru' an array and access each element in it without going out of bounds(getting off the array) foreach is forward only and read only. 
		for(int val : elements) 
			System.out.println(val);
	}
}