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

	public static Boolean getBool() throws IllegalArgumentException{
    String answer;
    Scanner scan = new Scanner(System.in);
    answer = scan.nextLine();
    if(answer.equals("True") ||  answer.equals("T") || answer.equals("1") || answer.equals("true")){
      return true;

    }
    else if(answer.equals("False") || answer.equals("F") || answer.equals("0")|| answer.equals("false")){
      return false;


    } else {
      throw new IllegalArgumentException("Input value for method getBool() should be true,T,1,False,false,F,0");

    }

	}

	public static double getDouble() throws IllegalArgumentException{
    String answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		double value;
		try{
			value = Double.parseDouble(answer);
		} catch(Exception e){
			throw new IllegalArgumentException("Input value for method getDouble() should be a numeric value.");
		}

		return value;

	}

	public static long getLong() throws IllegalArgumentException{
		String answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		double value;

		try{
			value = Double.parseDouble(answer);

		} catch (Exception e) {
			throw new IllegalArgumentException("Input value for method getLong() should be a numeric value");
		}

		long longValue = (long) value;
		return longValue;
	}

	public static float getFloat() throws IllegalArgumentException{
		String answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		float value;
		try{
			value = Float.parseFloat(answer);
		} catch (Exception e){
			throw new IllegalArgumentException("Input value for method getFloat() should be a numeric value.");
		}

		return value;
	}

	public static short getShort() throws IllegalArgumentException{
		String answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		double value;

		try{
			value = Double.parseDouble(answer);
		} catch (Exception e){
			throw new IllegalArgumentException("Input value for method getShort() should be a numeric value.");
		}
		short valueShort = (short) value;
		return valueShort;

	}

	public static char getChar(){
		String answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		char value;

		value = answer.charAt(0);
		return value;

	}

	public static String getString(){
		String answer;
		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();
		return answer;

	}

}
