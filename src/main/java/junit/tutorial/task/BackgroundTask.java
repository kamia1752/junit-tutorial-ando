package junit.tutorial.task;

import java.util.concurrent.Executors;

public class BackgroundTask {
	private final Runnable task;

	public BackgroundTask(Runnable task) {
		this.task = task;
	}

	public void invoke() {
		// TODO Auto-generated method stub
		Executors.newSingleThreadExecutor().execute(task);
	}
}
