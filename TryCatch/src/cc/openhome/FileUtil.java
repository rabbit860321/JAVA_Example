package cc.openhome;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
	public static String readFile(String name) throws FileNotFoundException{  //宣告方法中會拋出例外
		StringBuilder text = new StringBuilder();
		try {
			Scanner console = new Scanner(new FileInputStream(name));
			while(console.hasNext()) {
				text.append(console.nextLine()).append("\n");
			}
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
			throw ex;  //執行時會拋出例外
		}
		return text.toString();
	}
}
