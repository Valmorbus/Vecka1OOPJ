package vecka1LektionerIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Byteströmmar. läser filer som inte är text, exempelvis mp3 och film
 * @author borgs_000
 *
 */

public class CopyFile {

	public static void main(String[] args) {
		
	}
	private void copyFile()
	{
		File file = new File("C:/Users/borgs_000/workspace/OOPJ15/text/sheep.jpeg");
		File file2 = new File("C:/Users/borgs_000/workspace/OOPJ15/text/sheep2.jpeg");
		int byteToRead=0;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(file);
			fout= new FileOutputStream(file2);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
		
		try {
			do{
				byteToRead = fin.read();
				if (byteToRead !=-1)
					fout.write(byteToRead);
			}while (byteToRead != -1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
