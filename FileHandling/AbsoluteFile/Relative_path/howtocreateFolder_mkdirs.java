package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;

public class howtocreateFolder_mkdirs {
public static void main(String[] args) throws IOException {
	File f = new File("E:\\tempo\\sunil\\hardwork\\resume.docx");
	
	System.out.println(f.mkdirs());

}
}
