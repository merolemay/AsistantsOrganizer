package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AttendansOrganizer {
	
	public Attendants root;
	public Attendants first;
	
	public AttendansOrganizer () {
		root = new Attendants(0,null,null,null,null,null,null, null);
	}
	
	public void loadFile(String filename) throws IOException {
		String f;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
		while((f=bufferedReader.readLine())!=null) {
			String [] r =f.split(",");
			Attendants q = new Attendants(Integer.parseInt(r[0]),r[1],r[2],r[3],r[4],r[5],r[6],r[7]);
		}
		bufferedReader.close();
	}

	public boolean isEmpty() {
		return (root == null);
	}
	
	public Attendants searchAssitant(int a) {
		Attendants r = null;
		if (!isEmpty()) {
			if (a == root.getId()) {
				return root;
			} else {
				if (a < root.getId()) {
					r = searchAssitant(root.getLeft().getId());
				} else {
					r = searchAssitant(root.getRight().getId());
				}
			}
		}
		return r;
	}
}
