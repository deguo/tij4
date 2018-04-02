package ch21concurrency;

import java.util.concurrent.*;

/**
 * <pre>
 * Output:
 * caught java.lang.RuntimeException
 * </pre>
 */
public class D23_SettingDefaultHandler {
	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new D20_ExceptionThread());
		exec.shutdown();// 添加关闭jvm
	}
}