package FileHandling.AbsoluteFile;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
public static void main(String[] args) throws IOException{
	File f = new File("E:\\eclipse ID\\homework\\resume.docx");
	System.out.println(f.createNewFile());

}
}
