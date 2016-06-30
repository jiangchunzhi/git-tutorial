public class TestOS {
	
	public static void main(String[] args) {
		String os = System.getProperty("os.name");
		System.out.println(os);

		if(os.toLowerCase().startsWith("win")) {
			System.out.println("windows");
		} else {
			System.out.println("not windows");
		}
	}

}
