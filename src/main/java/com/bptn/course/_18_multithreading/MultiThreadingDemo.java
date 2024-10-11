package com.bptn.course._18_multithreading;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.start();
		thread2.start();

		Thread t1 = new Thread(new MyRunnable());
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}

}
