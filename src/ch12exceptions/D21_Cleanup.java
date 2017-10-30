package ch12exceptions;

/**
 * Guaranteeing proper cleanup of a resource.
 * 
 * <pre>
 * Output:
 * dispose() successful
 * </pre>
 */
public class D21_Cleanup {
	public static void main(String[] args) {
		try {
			D20_InputFile in = new D20_InputFile("D21_Cleanup.java");
			try {
				String s;
				int i = 1;
				while ((s = in.getLine()) != null)
					; // Perform line-by-line processing here...
			} catch (Exception e) {
				System.out.println("Caught Exception in main");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch (Exception e) {
			System.out.println("D20_InputFile construction failed");
		}
	}
}