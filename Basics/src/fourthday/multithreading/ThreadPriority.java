package fourthday.multithreading;

public class ThreadPriority extends Thread{

	//To set a thread name use constructor
	public ThreadPriority(String name) {
		super(name);
	}

	public ThreadPriority() {
		
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		//ThreadPriority t1 = new ThreadPriority();
		//ThreadName can be set as:
		ThreadPriority t1 = new ThreadPriority("Thread Number 1");
		
		ThreadPriority t2 = new ThreadPriority();
		
		ThreadPriority t3 = new ThreadPriority();
		
		//Priority can be set using setPriotity() method
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
	} 

}
