package project1;

public class InvalidInputException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Invalid input";
	}

}
