package programs;

import java.io.FileReader;
import java.io.FileWriter;

public class P41_CopyFile1To2 {

	public static void main(String[] args) throws Exception {
		
		String file = "C:\\java files\\Programming Practice\\Input.txt";
		FileReader fr = new FileReader(file);	
		FileWriter fw = new FileWriter("Output1.txt");
		
		int line ;
		while((line = fr.read()) != -1) {
			fw.write(line);
		}
		fw.close();
		fr.close();
	}

}
