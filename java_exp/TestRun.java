//using runnable interface

class TestRun implements Runnable{  //step 1
public void run(){  //step 2
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Test t=new Test();  //step 3
Thread t1 =new Thread(t);  //step 4
t1.start();  
 }  
} 

