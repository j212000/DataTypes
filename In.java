import java.util.Scanner;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;



public class In{

	public static int getInt() throws IllegalArgumentException{

		String answer;
		Scanner input = new Scanner(System.in);
    answer = input.nextLine();
    double value;
    try{
      value = Double.parseDouble(answer);

    } catch(Exception e) {
      throw new IllegalArgumentException("Input value for method getInt() should be of Integer Value");

    }
    int intValue = (int) value;
    return intValue;


	}

	public static Boolean getBool() {
    return true; //TODO fix this
	}

	public static char getChar() {
    return 'A'; //TODO fix this
	}

}
