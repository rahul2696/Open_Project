class URClass extends Thread{
	//If U extend a class, U should override the run function which defines the functionality of the Thread that U Create. 
	@Override
	 public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("File reading is going on a separate Thread!!!");	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
public class MultiThreadingExample {
	
	//Simulation(Imitation) of performing a very large task..
	static void readLargeCode() throws Exception {
		for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);//Function that will delay UR execution by a sec.....
				System.out.println("File reading is going on in the Main function!!!");			
		}
	}
	
	static void usingThreadClass() {
		URClass cls = new URClass();//Create the instance of the class U have extended. 
		cls.start();//Starts the thread...
	}
	
	//This function will create a Thread using RUNNABE INTERFACE.
	static void usingLambdaExpression() {
		Runnable method = () ->{
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);//Function that will delay UR execution by a sec.....
					System.out.println("File reading is going on in the Lambda function!!!");		
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		};
		Thread newThread  = new Thread(method);
		newThread.start();//Make the JVM to internally call the run function of the interface and invoke it parallelly..
	}
	
	public static void main(String[] args) throws Exception {
		usingThreadClass();//Run on seperate thread
		usingLambdaExpression();//Runs on separate thread
		readLargeCode();//THis is running on the Main thread
		System.out.println("This will run after the function is completed");
	}
}