import java.io.*; 
import java.util.Arrays;
import java.math.BigInteger;

public class RunSolution{

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) throws Exception{

		//input parsing and reading
		File input00File = new File("../../test-cases/input/input00.txt");
		BufferedReader brInput00 = new BufferedReader(new FileReader(input00File));

		File input01File = new File("../../test-cases/input/input01.txt");
		BufferedReader brInput01 = new BufferedReader(new FileReader(input01File));

		File input02File = new File("../../test-cases/input/input02.txt");
		BufferedReader brInput02 = new BufferedReader(new FileReader(input02File));

		String st;
		int currentLine = 0;
		String lineSplit[];

		String s00 = "";
		BigInteger n00 = null;

		String s01 = "";
		BigInteger n01 = null;

		String s02 = "";
		BigInteger n02 = null;

		while((st = brInput00.readLine()) != null){
			if(currentLine == 0){
				s00 = st;
			}else if(currentLine == 1){
				n00 = new BigInteger(st);
			}
			currentLine++;
		}

		currentLine = 0;

		while((st = brInput01.readLine()) != null){
			if(currentLine == 0){
				s01 = st;
			}else if(currentLine == 1){
				n01 = new BigInteger(st);
			}
			currentLine++;
		}

		currentLine = 0;

		while((st = brInput02.readLine()) != null){
			if(currentLine == 0){
				s02 = st;
			}else if(currentLine == 1){
				n02 = new BigInteger(st);
			}
			currentLine++;
		}

		// problem application

		BigInteger response00 = RepeatedString.run(s00, n00);
		BigInteger response01 = RepeatedString.run(s01, n01);
		BigInteger response02 = RepeatedString.run(s02, n02);
		

		// expected outputs

		File output00File = new File("../../test-cases/output/output00.txt");
		BufferedReader brOutput00 = new BufferedReader(new FileReader(output00File));

		File output01File = new File("../../test-cases/output/output01.txt");
		BufferedReader brOutput01 = new BufferedReader(new FileReader(output01File));

		File output02File = new File("../../test-cases/output/output02.txt");
		BufferedReader brOutput02 = new BufferedReader(new FileReader(output02File));

		BigInteger output00 = null;
		BigInteger output01 = null;
		BigInteger output02 = null;

		while((st = brOutput00.readLine()) != null){
			output00 = new BigInteger(st.trim());
		}

		while((st = brOutput01.readLine()) != null){
			output01 = new BigInteger(st.trim());
		}

		while((st = brOutput02.readLine()) != null){
			output02 = new BigInteger(st.trim());
		}


		System.out.println(((response00.equals(output00)) ? ANSI_GREEN : ANSI_RED) + "INPUT 00");
		System.out.println(((response01.equals(output01)) ? ANSI_GREEN : ANSI_RED) + "INPUT 01");
		System.out.println(((response02.equals(output02)) ? ANSI_GREEN : ANSI_RED) + "INPUT 02" + ANSI_RESET);
	}
}