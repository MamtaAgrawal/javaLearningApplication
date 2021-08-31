
public class ExceptionTest {

	
	public void exceptionTest(String message) throws CustomException{
		
		if(message==null) {
			throw new CustomException("please enter the message , messag is empty ");
		} else {
			System.out.println(message);
		}
			
	}
	
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		ExceptionTest test = new ExceptionTest();
//		test.exceptionTest(null);
		try {
			test.exceptionTest("Hello Welcome to learning session");
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
