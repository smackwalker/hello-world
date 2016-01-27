import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void test() throws IOException {
		File file = new File("Out.txt");
		FileOutputStream fOutputStream = new FileOutputStream(file);
		PrintStream pStream = new PrintStream(fOutputStream);
		System.setOut(pStream);
		HelloWorld.main(null);
		Scanner keyboard = new Scanner(file);
		int test = 0;
		boolean pass = false;
		assertEquals(keyboard.next(),"Hello");
		assertEquals(keyboard.next(),"Scott");
//		while (keyboard.hasNext())
//		{
//			if (test == 0)
//			{
//				keyboard.next().equals("Hello");
//				test++;
//			}
//			else
//			{
//				keyboard.next().equals("World");
//				pass = true;
//			}
//		}
		keyboard.close();
		fOutputStream.close();
//		if (!pass)
//		{
//			fail("Not yet implemented");
//		}
		System.setOut(System.out);
	}

}
