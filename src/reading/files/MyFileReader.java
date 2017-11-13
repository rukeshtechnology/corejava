package reading.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	private  final String FILENAME = "C:\\temp\\Hello.java";
	BufferedReader bufferedReader;
	FileReader fileReader;
	
	public void readFile() {
		try {
			fileReader = new FileReader(FILENAME);
			bufferedReader = new BufferedReader(fileReader);
			String currentLine;
			while((currentLine = bufferedReader.readLine()) != null) {
				System.out.println(currentLine);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();	
				}
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
