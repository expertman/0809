import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.Math.random;

public class StaticImportDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rand = (int)(random() * 6 + 1);
		out.println("rand = " + rand);
		out.println("PI = " + PI);
	}
}
