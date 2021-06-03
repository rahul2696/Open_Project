class SampleCode{
	public void sampleFunc() {
		synchronized(this) { 
		for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Thread Beep #" + i);	
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
class MyThreadClass extends Thread{
	//If U extend a class, U should override the run function which defines the functionality of the Thread that U Create. 
	static SampleCode code = new SampleCode();//only one object all the time....
	@Override
	 public void run() {
		code.sampleFunc();
	}
}

public class ThreadSynchonization {
	public static void main(String[] args) throws Exception{
		MyThreadClass cls = new MyThreadClass();
		cls.start();
		Thread.sleep(2000);
		MyThreadClass cls2 = new MyThreadClass();
		cls2.start();
		Thread.sleep(2000);
		MyThreadClass cls3 = new MyThreadClass();
		cls3.start();
		Thread.sleep(2000);
		MyThreadClass cls4 = new MyThreadClass();
		cls4.start();	
	}
}