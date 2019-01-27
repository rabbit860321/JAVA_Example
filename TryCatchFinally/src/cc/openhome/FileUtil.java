package cc.openhome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {

	public static String readFile(String name) throws FileNotFoundException{  //�ŧi��k���|�ߥX�ҥ~
		StringBuilder text = new StringBuilder();
		Scanner console = null;
		try {
			console = new Scanner(new FileInputStream(name));
			while(console.hasNext()) {
				text.append(console.nextLine()).append("\n");
			}
		}finally {//try�϶����L�o�ͨҥ~ finally���|����
			if(console != null) {
				console.close();
			}
		}
		return text.toString();
	}
}
