package tabToXml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileReader {
	
	private File inputFile;
	private ArrayList<String> tab = new ArrayList<>();
	
	public TextFileReader(String inputFile){
		this.inputFile = new File(inputFile);
		this.readFile();
	}
	
	private void readFile(){
		Scanner sc = null;
		try {
			sc = new Scanner(inputFile);
			while(sc.hasNextLine()){
				String test = sc.nextLine();
				// if(test.contains("-") && test.contains("|"))
				tab.add(test);
			}		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
	
	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();		
		for(String s : tab) {
			sb.append(s + "\n");
		}
		return sb.toString();		
	}
}