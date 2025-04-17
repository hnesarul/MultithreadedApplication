package com.optimum;

public class TaskE implements Runnable{

	String result;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			this.result = "Task E completed";
		} catch (InterruptedException e) {
			e.printStackTrace();
			result = "Error in task A";

		}
	}

	public String getResult() {
		return this.result;
	}

}
