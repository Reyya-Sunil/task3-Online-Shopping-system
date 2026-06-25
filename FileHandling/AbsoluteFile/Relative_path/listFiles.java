package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class listFiles {
public static void main(String[] args) throws IOException{
	File f = new File("E:\\tempo\\sunil\\hardwork");
	System.out.println(Arrays.toString(f.listFiles()));
}
}
