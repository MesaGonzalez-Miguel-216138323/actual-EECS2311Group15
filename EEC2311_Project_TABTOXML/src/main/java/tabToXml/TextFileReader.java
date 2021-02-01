package tabToXml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileReader {
	
	private File inputFile;
	//private ArrayList<String> tab = new ArrayList<>();
	private List<List<String>> lists = new ArrayList<List<String>>();
	
	//Read in the file
	public TextFileReader(String inputFile){
		this.inputFile = new File(inputFile);
		this.readFile();
	}
	
	
	private void readFile(){
		Scanner sc = null;
		try {
			sc = new Scanner(inputFile);
			List<String> list = new ArrayList<>();
			
			String previousLine = "";
			while(sc.hasNextLine()){
				
				String line = sc.nextLine();
				if (!(previousLine.isEmpty()) && (line.contains("-") && line.contains("|"))) {
					list.add(line);
					
				}
				
				if ((previousLine.contains("-") && previousLine.contains("|")) && !(line.contains("-") && line.contains("|"))) {					
					lists.add(list);
					list = new ArrayList<>();					
					
				}		
				previousLine = line;
				
			}		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
	

	public List<List<String>> printList() {		
		//StringBuilder sb = new StringBuilder();	
		
//		for(List<String> s : lists) {
//			sb.append(s + "\n");
//		}
		//return sb.toString();	
		
	//	System.out.print(lists);
		return lists;
	}
}