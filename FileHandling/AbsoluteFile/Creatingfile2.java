package FileHandling.AbsoluteFile;

import java.io.File;
import java.io.IOException;



public class Creatingfile2 {
public static void main(String[] args) throws IOException {
	File F =new File("E:\\eclipse ID\\homework\\harish.docx");
	F.createNewFile();
	 boolean result = F.setWritable(false); // make file writable

     System.out.println("Set writable: " + result);
     System.out.println("Can write: " + F.canWrite());
}
}
