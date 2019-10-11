

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile
	{

		public static void RunIt()
			{
readLines("TestCode");
			}

		public static void readLines(String fileName)
			{
				String line = null;

				try
					{
						FileReader fileReader = new FileReader(fileName);
						BufferedReader bufferedReader = new BufferedReader(fileReader);
						
						while ((line = bufferedReader.readLine()) != null)
							{
								lookForTriggers(line);
								
							}
						bufferedReader.close();
					} catch (FileNotFoundException ex)
					{
						System.out.println("Unable to open file '" + fileName + "'");
					} catch (IOException ex)
					{
						System.out.println("Error reading file '" + fileName + "'");
					}

			}

		public static void lookForTriggers(String line) {
			
			for(int i = 0; i < arrayListsOfObjects.triggers.size(); i++) {
				
				if(line.equals(arrayListsOfObjects.triggers.get(i))) {
				
					
					
				}
				
			}
			
			
		
			
		}

		

	}
