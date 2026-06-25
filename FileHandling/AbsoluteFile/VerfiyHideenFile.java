package FileHandling.AbsoluteFile;
import java.io.File;
public class VerfiyHideenFile {
public static void main(String[] args) {
	File f = new File("E:\\eclipse ID\\homework");
	System.out.println(f.isHidden());
}
}
