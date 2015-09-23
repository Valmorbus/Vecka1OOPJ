package vecka1LektionerIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTryWithR {
	public static void main(String[] args) {
		CopyFileTryWithR cp = new CopyFileTryWithR();
		cp.makeFileCopy();

	}

	private void makeFileCopy() {
		File file = new File("C:/Users/borgs_000/workspace/OOPJ15/text/Rick Astley3.mp3");
		File file2 = new File("C:/Users/borgs_000/workspace/OOPJ15/text/best Copy.mp3");
		int byteToRead = 0;

		try (FileInputStream fin = new FileInputStream(file); FileOutputStream fout = new FileOutputStream(file2);) {
			do {
				byteToRead = fin.read(); // läser byte
				if (byteToRead != -1)
					fout.write(byteToRead);// skriver byte
			} while (byteToRead != -1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
