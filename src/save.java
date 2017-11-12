import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class save {


	public void save(String text, String location) {
		try {
			
			System.out.println(text);
			File statText = new File(location);
			FileOutputStream is = new FileOutputStream(statText);
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer w = new BufferedWriter(osw);
			w.write(text+ "\n");
			w.close();
		}catch (IOException e){
			System.err.println("Problem writing to the file statsTest.txt");
		}
	}
	

}