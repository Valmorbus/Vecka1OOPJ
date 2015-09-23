package vecka1LektionerIO;

import java.io.File;

public class FileChecker {

	public static void main(String[] args) {
		File file = new File("test/test.txt");
		System.out.println("AbsolutePath " + file.getAbsolutePath());
		System.out.println("getPath " + file.getPath());
		System.out.println("parent " +file.getParent());
		System.out.println("last modified" + file.lastModified());
		FileChecker fc = new FileChecker();
		fc.listFiles();
	}
	//listar alla filer i en map och skriver ut dessa
	private void listFiles()
	{
		File filedir = new File("/test");
		if(filedir.isDirectory())
		{
			String[] files = filedir.list();
			for(String fil: files)
			{
				System.out.println(fil);
			}
		}
	}

}
