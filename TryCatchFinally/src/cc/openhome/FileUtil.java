package cc.openhome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {

	public static String readFile(String name) throws FileNotFoundException{  //宣告方法中會拋出例外
		StringBuilder text = new StringBuilder();
		Scanner console = null;
		try {
			console = new Scanner(new FileInputStream(name));
			while(console.hasNext()) {
				text.append(console.nextLine()).append("\n");
			}
		}finally {//try區塊有無發生例外 finally都會執行
			if(console != null) {
				console.close();
			}
		}
		return text.toString();
	}
}
