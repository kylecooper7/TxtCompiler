import objects.StringObject;
import objects.booleanObject;

public class Instructions {
// all the different types of instructions
	public static void assignInstructions(String line) {
		String s = "";
		for(int i = 1; i < line.length(); i ++) {
			
		s = line.substring(0, i);
		
		switch (s) {
		case "boolean" : theBoolean(line);
		break;
		case "if(" : theIfStatement(line);
		break;
		case "}" : closingBracket(line);
		break;
		case ")" : closingParen(line);
		break;
		case "String": theString(line);
		break;
		case "System.out.println(" : sysout(line);
		
		}
		}
		
		
	}
	
	public static void closingParen(String s) {
	
}

	public static void sysout(String s) {
		if(s.substring(19, 20).equals("\"")) {
			System.out.println(s.substring(20, s.length() - 3));
		}
		else {
			String theStringName = s.substring(19, s.length() - 2); 
			
			
			for(int i = 0; i < arrayListsOfObjects.strings.size(); i ++) {
				
				
				if(arrayListsOfObjects.strings.get(i).getName().equals(theStringName)) {
					System.out.println(arrayListsOfObjects.strings.get(i).getTheString());
				
				}
				
			}
			
		}
}

	public static void closingBracket(String s) {
	
	
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
		arrayListsOfObjects.booleans.add( new booleanObject(name, value));
	}
	
	public static void theString(String s) {
			
			String[] words = s.split(" ");
			String name = words[1];
			String theString = s.substring((words[0].length() + words[1].length() + 5), s.length() - 2);
			arrayListsOfObjects.strings.add(new StringObject("", ""));
			arrayListsOfObjects.strings.get(0).setName(name);
			arrayListsOfObjects.strings.get(0).setTheString(theString);
	}

	
	
}
