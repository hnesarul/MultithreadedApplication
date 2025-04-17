package com.optimum;

public class TaskF implements Runnable {

	int finalResult;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("The final result is :" + finalResult);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public void setResult(int result) {
		this.finalResult = result;
	}

}
