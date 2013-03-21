public class Main {

	public static void main(String[] args) {
		
		CallMePlease c = new CallMePlease();
		try {
			c.getSampleException();
			
		} catch (Exception e) {
			System.out.println("catch main");
			e.printStackTrace();
		}
	}

}
