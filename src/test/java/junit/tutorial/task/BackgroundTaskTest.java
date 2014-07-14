package junit.tutorial.task;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import sun.misc.GC.LatencyRequest;

public class BackgroundTaskTest{
	
	@Rule
	public Timeout timeout = new Timeout(1000);
	
	@Test
	public void test() throws Exception {
		// SetUp
		final CountDownLatch latch = new CountDownLatch(1);
		final AtomicReference<String> backgroundThreadName = new AtomicReference<String>();
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				backgroundThreadName.set(Thread.currentThread().getName());
				latch.countDown();
			}
		};
		BackgroundTask sut = new BackgroundTask(task);
		// Exercise
		sut.invoke();
		latch.await();
		// Verify
		assertThat(backgroundThreadName.get(), is(not(Thread.currentThread().getName())));
	}
}
