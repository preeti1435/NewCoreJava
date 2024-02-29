package com.edubridge.regularexpression;

public class ThreadExecutor implements Runnable{
	public void run () {
		for (int i=0;i<3;i++) {
			System.out.println("Thread"+" "+ Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		ThreadExecutor t1= new ThreadExecutor();
		t1.run();
		

	}

}
