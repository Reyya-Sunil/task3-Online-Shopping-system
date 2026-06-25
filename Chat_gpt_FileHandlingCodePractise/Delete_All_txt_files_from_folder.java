package Chat_gpt_FileHandlingCodePractise;

import java.io.File;
import java.util.Arrays;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class Delete_All_txt_files_from_folder {
public static void main(String[] args) {
	String path = "E:\\Sunil\\love\\";
	File f = new File(path);
	String[] list = f.list();
	int count =0;
	for(String name : list) {
		System.out.println("Left files : "+name );
		
		if(name.endsWith(".txt")) {
		File d= new File(path+name);
		if(d.delete()) {
			System.out.println("deleted succesfully...");
			count++;
		}
		}
		
		
	}	try {
		throw new Exception("File is not found ");
	}
catch(Exception as) {
	System.err.println("error :" +as.getMessage());
}
System.out.println("No of files delete : "+count);
}
}
