package fileHandling;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.FileHandler;

import org.junit.jupiter.api.Test;

public class filePath 

{

	
	
	
	public static void main(String[] args)
	{
		
		//absolute pat from project directory
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println(Paths.get("").toAbsolutePath().toString());
		System.out.println(Path.of("").toAbsolutePath().toString());
		System.out.println(Path.of("").toAbsolutePath().resolve("attachments").resolve("sample.txt"));
		System.out.println(Path.of("attachments","sample.txt").toAbsolutePath());
		
		
		//current source code path
		var classLocation = filePath.class.getResource("");
        System.out.println("Class is located at: " + classLocation);
	}
}
	