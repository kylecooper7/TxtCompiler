

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile
	{

		public static void RunAll()
			{
readLines("TestCode");
			}

		public static void readLines(String fileName)
			{
				String line = null;
				String trigga;
				try
					{
						FileReader fileReader = new FileReader(fileName);
						BufferedReader bufferedReader = new BufferedReader(fileReader);
						while ((line = bufferedReader.readLine()) != null)
							{
								
								
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

		

	}
