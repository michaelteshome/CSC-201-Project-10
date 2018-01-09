import java.io.*;
import java.io.File;
import java.util.*;

public class TextFiles {

	private static String filename = "SunriseData.txt";
	public static void main(String[] args) {
		readFile(filename);
	}
	public static void createFile(String j) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(j));
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
	}
	
	public static void readFile(String j) {
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(j));
		}
		catch(Exception e) {
			System.out.println("File not found");
		}
		
		while(inputStream.hasNextLine()) {
			String line = inputStream.nextLine();
			System.out.println("Day: Sunrise: Sunset ->" + " " + line);
		}
		inputStream.close();
		
		
	}
	
	
	
	
	
}
