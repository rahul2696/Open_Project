interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}


class Pig implements Animal {  // insted of extends we can use implements Pig "implements" the Animal interface
  public void animalSound() {
    
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
   
    System.out.println("Zzz");
  }
  
  
}

class Program9 {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}