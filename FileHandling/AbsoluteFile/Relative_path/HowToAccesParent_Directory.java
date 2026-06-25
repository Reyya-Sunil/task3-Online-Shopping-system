package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class HowToAccesParent_Directory {
public static void main(String[] args) throws IOException {
	File f = new File("E:\\tempo\\sunil\\hardwork\\temp.docx");
	File f2 = new File(f.getParent()+"\\sunil.docx");
	System.out.println(f2.createNewFile());
	System.out.println(new Date(f2.lastModified()));
	
	
}
}
