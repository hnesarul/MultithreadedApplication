package com.optimum;

public class TaskC implements Runnable {

	int resultC;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.resultC = 4 + resultC;
		} catch (InterruptedException e) {
			e.printStackTrace();
			resultC = 0;

		}
	}

	public int getResult() {
		return this.resultC;
	}

	public void setResult(int result) {
		this.resultC = result;
	}
}
