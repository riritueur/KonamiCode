import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileGenerator {
	public static void generate()throws IOException 
	{
		InputStream in = FileGenerator.class.getResourceAsStream("ACodeIsHiddenInThere.jpg");
		Files.copy(in, Paths.get(System.getProperty("user.home") + "\\Desktop\\ACodeIsHiddenInThere.jpg"), StandardCopyOption.REPLACE_EXISTING);
	}
	
	public static void main(String[] args){
		try {
			FileGenerator.generate();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
