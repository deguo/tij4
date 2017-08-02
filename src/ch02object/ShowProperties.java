package ch02object;

public class ShowProperties {
	public static void main(String[] args) {
		// 输出所有系统属性
		System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("java.library.path"));
	}
}