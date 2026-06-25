package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class lastdateModifed {
public static void main(String[] args) throws IOException {
	File f = new File("E:\\tempo\\sunil\\hardwork\\temp.docx");
	System.out.println(new Date(f.lastModified()));
	
}
}
