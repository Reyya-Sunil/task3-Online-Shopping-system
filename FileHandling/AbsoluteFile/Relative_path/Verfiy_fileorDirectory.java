package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;

public class Verfiy_fileorDirectory {
public static void main(String[] args) {
	File f = new File("E:\\tempo\\sunil\\hardwork\\temp.docx");
	System.out.println(f.isFile());
	System.out.println(f.isDirectory());
}
}
