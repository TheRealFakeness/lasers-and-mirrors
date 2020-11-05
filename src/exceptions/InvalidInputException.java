package exceptions;

public class InvalidInputException extends Exception{
	private static final long serialVersionUID = 0;
	
	private String input;
	
	public InvalidInputException(String input) {
		super("Client with given name was not found.");
		this.input = input;
	}

	public String getInput() {
		return input;
	}
}