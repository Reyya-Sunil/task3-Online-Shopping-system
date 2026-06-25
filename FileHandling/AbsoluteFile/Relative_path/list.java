package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class list {
public static void main(String[] args) throws IOException {
	File f = new File("E:\\tempo\\sunil\\hardwork");
//	System.out.println(f.list());
	   System.out.println("Exists: " + f.exists());
       System.out.println("Is Folder: " + f.isDirectory());
   System.out.println(Arrays.toString(f.list()));
}
}
