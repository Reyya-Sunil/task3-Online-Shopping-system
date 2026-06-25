package FileHandling.AbsoluteFile;

import java.io.File;
import java.io.IOException;

public class RemoveReadOnlyMode {
public static void main(String[] args) throws IOException {
	File f = new File ("E:\\eclipse ID\\homework\\sunil.docx");
	 boolean result = f.setWritable(true); // make file writable

     System.out.println("Set writable: " + result);
     System.out.println("Can write: " + f.canWrite());
//     f.delete();
     f.createNewFile();
        

    
}
}
