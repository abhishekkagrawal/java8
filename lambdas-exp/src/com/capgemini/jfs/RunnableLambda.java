package com.capgemini.jfs;

public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {

	//	Runnable runnable = new Runnable() {
	//
	//	    @Override
	//	    public void run() {
	//		for (int i = 0; i < 3; i++) {
	//		    System.out.println("Hello, Runnable without Lambda");
	//		    Thread.currentThread().getName();
	//		}
	//
	//	    }
	//	};

	Runnable runLambda = () -> {
	    for (int i = 0; i < 3; i++) {
		System.out.println("Hello, Runnable with Lambda");
		Thread.currentThread().getName();
	    }
	};

	Thread th = new Thread(runLambda);
	th.start();
	th.join();

    }
}
