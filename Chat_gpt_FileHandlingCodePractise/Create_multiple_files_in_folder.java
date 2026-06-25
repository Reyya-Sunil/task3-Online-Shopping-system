package Chat_gpt_FileHandlingCodePractise;

import java.io.File;
import java.io.IOException;

public class Create_multiple_files_in_folder {
public static void main(String[] args) throws IOException {
String path = "E:\\Sunil\\love\\";
String [] name = {"file1.txt","file2.txt","file3.txt","file4.txt"};
for(String names :name ) {
	
	File f = new File(path+names);
	
	try {
		if(f.exists()) {
	throw  new Exception("File is alread created");
		}else {
			f.createNewFile();
			System.out.println("File is Created ");
		}
	}
	catch(Exception as) {
		System.err.println("Error: " + as.getMessage());
	}
}
		

	
}
}
