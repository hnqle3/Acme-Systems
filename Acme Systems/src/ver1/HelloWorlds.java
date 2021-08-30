package ver1;
import java.util.*;

public class HelloWorlds {

	public static void main(String[] args) {
		System.out.println("Hello from Eclipse");
		System.out.println("Hello from Github");

	}

public static void heyNow() {
	String Msg = "Hey Now!";
	System.out.println(Msg);
}
public static void whatFor() {
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter first number- ");  
	String a= sc.next(); 
	String Msg = a+"what for";
	System.out.println(Msg);
}


}
