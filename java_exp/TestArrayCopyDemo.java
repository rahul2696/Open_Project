class TestArrayCopyDemo {  
    public static void main(String[] args) {  
        System.out.println(" Enter the no of ele:");
        int[] size = Integer.parseInt(System.concole().readLine());
	    int[] elements =new int[size];		
        
        for (int i =0; i <size; i++){
			System.out.println("Enter a numbr to store"+i);
			elements[i] = Integer.parseInt(System.concole().readLine());
		}  
		for (int val :elements)System.out.println(val);
	}
        

}  