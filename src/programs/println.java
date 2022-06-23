package programs;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class println {

	public static void main(String[] args) throws IOException {

		System.out.println("println");
		System.err.println("error message");
		System.out.write("write stream \n".getBytes());
		System.out.format("%s \n", "message");

		
//		PrintStream myout =  new PrintStream(new FileOutputStream(FileDescriptor.out));
//		myout.print("www.instanceofjava.com \n");

//		PrintStream java.io.PrintStream.format(String format, Object... args)
//	
//		System.console().writer().println("console");
	}
	

}
