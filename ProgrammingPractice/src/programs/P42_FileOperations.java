package programs;

import java.io.File;

public class P42_FileOperations {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\java files\\Programming Practice\\FileOperation.txt");
		file.createNewFile();
		System.out.println("File Created");
		
		if(file.isFile()) {
			System.out.println("File");
		}
		else if(file.isDirectory())
			System.out.println("Directory");
		
		System.out.println("File size : "+file.length());
		System.out.println(file.toPath());
	}

}
