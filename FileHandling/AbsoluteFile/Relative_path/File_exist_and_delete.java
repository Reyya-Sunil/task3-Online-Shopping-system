package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;

public class File_exist_and_delete {
public static void main(String[] args) throws IOException{
	File f = new File("./resume.docx");
	if(f.exists())
		f.delete();
	System.out.println(f.createNewFile());
	
	
}
}
