package FileHandling.AbsoluteFile.Relative_path;

import java.io.File;
import java.io.IOException;

public class howtocreateFolder_mkdir {
public static void main(String[] args) throws IOException {
	File f = new File("./homework2");
	System.out.println(f.mkdir());
}
}
