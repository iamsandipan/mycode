package com.interviiew.threadlocal;

public class ThreadLocalDemo extends Thread{
	public static void main(String args[]) {
		 
		Thread threadOne = new ThreadLocalDemo();
		threadOne.start();
		Thread threadTwo = new ThreadLocalDemo();
		threadTwo.start();
		
	}
		@Override
		public void run() {
			
			
			// sample code to simulate transaction id
			Context context = new Context();
			context.setTransactionId(getName());
			if("Thread-0".equals(getName())){
				sleeep(15000);
			}
			if("Thread-1".equals(getName())){
				sleeep(10000);
			}
			// set the context object in thread local to access it somewhere else
			MyThreadLocal.set(context);
			 
			/* note that we are not explicitly passing the transaction id */
			new BusinessService().businessMethod();
			MyThreadLocal.unset();
		 
		}
		private void sleeep(long x) {
			try {
				sleep(x);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
