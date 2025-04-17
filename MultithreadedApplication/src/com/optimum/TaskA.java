package com.optimum;

public class TaskA implements Runnable {

	int result;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.result = 2;
		} catch (InterruptedException e) {
			e.printStackTrace();
			result = 0;

		}
	}

	public int getResult() {
		return this.result;
	}

}
