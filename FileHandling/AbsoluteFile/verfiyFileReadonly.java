package FileHandling.AbsoluteFile;

import java.io.File;

public class verfiyFileReadonly {
public static void main(String[] args) {
	File F = new File("E:\\eclipse ID\\homework");
	System.out.println(F.canWrite());
}
}
