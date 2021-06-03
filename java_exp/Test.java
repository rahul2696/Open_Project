//Thread => using thread class

class Test extends Thread{  //step 1
public void run(){  //step 2 override run method
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Test t1=new Test(); //step 3 create obj 
t1.start(); //step 4 start the thread 
 }  
}
