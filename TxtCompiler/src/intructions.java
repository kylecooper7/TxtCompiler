
public class intructions {
// all the different types of instructions
	public static void assignInstructions(String s) {
		switch (s) {
		case "boolean" : theBoolean(s);
		case "if{" : theIfStatement(s);
		}
		
		
	}
	
	public static void theIfStatement(String s) {
	
	}

	public static void theBoolean(String s) {
		
		String[] words = s.split(" ");
		String name = words[1];
		boolean value;
		if(words[3].equals("true;")) {
		value = true;
		}
			else {
				value = false;
			}
		
		
	}
	
}
