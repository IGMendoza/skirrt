package dat_phat_project_over_there;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Parser {
	Vector<Vector<String>> data;
	Scanner inFile;
	
	public Parser(String file_name) throws IOException {
		this.data = new Vector<Vector<String>>();
		
		try {
			this.inFile = new Scanner(new File(file_name));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(inFile.hasNextLine()) {
			String line = inFile.nextLine();
			String[] parts = line.split("\t");
			Vector<String> trim = new Vector<String>(4);
			if(parts[0].charAt(0) != '#') {
				for(int i = 0; i < 4; i++) {
					trim.add(parts[i]);
				}
				this.data.add(trim);
			}
		}
	}
	
	public Vector<Vector<String>> get_attributes(){
		Vector<Vector<String>> attributes = new Vector<Vector<String>>();
		boolean l_skin = false, l_hair_1 = false, l_hair_2 = false, 
				g_eye = false, b_eye = false;
		for(int i = 0; i < this.data.size(); i++) {
			if(l_skin && l_hair_1 && l_hair_2 && g_eye && b_eye) {
				break;
			}
			if(this.data.get(i).get(0).equals("rs1426654")) {
				l_skin = true;
				attributes.add(this.data.get(i));
			}
			if(this.data.get(i).get(0).equals("rs12821256")) {
				l_hair_1 = true;
				attributes.add(this.data.get(i));
			}
			if(this.data.get(i).get(0).equals("rs35264875")) {
				l_hair_2 = true;
				attributes.add(this.data.get(i));
			}
			if(this.data.get(i).get(0).equals("rs7495174")) {
				g_eye = true;
				attributes.add(this.data.get(i));
			}
			if(this.data.get(i).get(0).equals("rs12913832")) {
				b_eye = true;
				attributes.add(this.data.get(i));
			}
		}		
		return attributes;
	}
}
