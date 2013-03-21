public class CallMePlease {
	public void getSampleException() throws Exception {

		try {

			try {

				throw new Exception();
				// Unreachable Code cause of throw new Exception();
			} catch (Exception e) {
				System.out.println("catch deepest getSampleException ");
				e.printStackTrace();
				throw e;
				// Unreachable Code cause of throw e;
			}

			// Unreachable Code cause of throw(in catch)
			// if Exception not happened this code will "not unreachable"

		} catch (Exception e2) {
			System.out.println("catch getSampleException");
			e2.printStackTrace();
			throw e2;// must throws cause' this is outermost try catch (Of cause
						// 'surround with try/catch' is warning')

			// Unreachable Code cause of throw e2;
		}

	}

}