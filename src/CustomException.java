
public class CustomException extends Exception{
	
	private String message;



	public CustomException( String message) {
		// TODO Auto-generated constructor stub
		this.message= message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
