import objects.StringObject;
import objects.booleanObject;
import java.util.Scanner;

public class Instructions {
	
	static boolean boolyBooly = true;
	static int bracketCounter = 0;
	static Scanner stringInput = new Scanner(System.in);
// all the different types of instructions
	public static void assignInstructions(String line) {
		String s = "";
		if(line.equals("{")) {
			openingBracket(line);
		}
		else if(line.equals("}")) {
			closingBracket(line);
		}
		else if(arrayListsOfObjects.conditionOfBooly.get(arrayListsOfObjects.conditionOfBooly.size() - 1)) 
		{
		for(int i = 1; i < line.length(); i ++) {
			
		s = line.substring(0, i);
		switch (s) {
		case "boolean" : theBoolean(line);
		break;
		case "if(" : theIfStatement(line);
		break;
		case "{" : openingBracket(line);
		break;
		case "String": theString(line);
		break;
		case "System.out.println(" : sysout(line);
		break;
		default: 
		
		}
		}
	}
		
	}
	

	public static void openingBracket(String line) {
	bracketCounter++;
	
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
	bracketCounter--;
	if(bracketCounter==0) {
		arrayListsOfObjects.conditionOfBooly.remove(arrayListsOfObjects.conditionOfBooly.size() - 1);
	}
		
	}
	


	public static void theIfStatement(String s) {
	
		if (s.substring(3).equals("true)")) {
			arrayListsOfObjects.conditionOfBooly.add(true);
		}
		else if (s.substring(3).equals("false)")) {
			arrayListsOfObjects.conditionOfBooly.add(false);
		}
		else {
			String theBooleanName = s.substring(3, s.length() - 1); 
			for(int i = 0; i < arrayListsOfObjects.booleans.size(); i ++) {
				
				if(arrayListsOfObjects.booleans.get(i).getName().equals(theBooleanName)) {
					
					if(arrayListsOfObjects.booleans.get(i).getValue()) {
						arrayListsOfObjects.conditionOfBooly.add(true);
					}
					else {
						arrayListsOfObjects.conditionOfBooly.add(false);
					}
				
				}
				
			}
			
		
		}
		
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
		arrayListsOfObjects.booleans.add( new booleanObject("", false));
		arrayListsOfObjects.booleans.get(arrayListsOfObjects.booleans.size() - 1).setName(name);
		arrayListsOfObjects.booleans.get(arrayListsOfObjects.booleans.size() - 1).setValue(value);
	}
	
	public static void theString(String s) {
			
			String[] words = s.split(" ");
			String name = words[1];
			
			String theString = s.substring((words[0].length() + words[1].length() + 5), s.length() - 2);
			if(theString.equals("input")) {
				System.out.println("Please input a value for the String " + name + ":");
				theString = stringInput.nextLine();
			}
			arrayListsOfObjects.strings.add(new StringObject("", ""));
			arrayListsOfObjects.strings.get(arrayListsOfObjects.strings.size() - 1).setName(name);
			arrayListsOfObjects.strings.get(arrayListsOfObjects.strings.size() - 1).setTheString(theString);
	}

}
