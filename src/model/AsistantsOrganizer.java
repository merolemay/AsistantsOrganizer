package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AsistantsOrganizer {
	
	public AsistantRoot root;
	public Assistant first;
	
	public AsistantsOrganizer () {
	}
	
	public void loadFile(String filename) throws IOException {
		String f;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
		while((f=bufferedReader.readLine())!=null) {
			String [] r =f.split(",");
			Assistant q = new Assistant(Integer.parseInt(r[0]),r[1],r[2],r[3],r[4],r[5],r[6],r[7],null);
			addAsistant(q);
		}
		
	}
	
	public void addAsistant(Assistant asistant) {
		
	}
}
