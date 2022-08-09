import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Abstract Class
 * - class 선언시 abstract으롤 선언된 클래스
 * - instance로 생성할 수 없다.
 * - 1)자식 클래스를 통해 생성하는 방법
 * - 2)static 멤버로 생성하는 방법
 * - 다형성의 강제화
 */
public class AbstractClassDemo1 {
	private int age;
	public static void main(String[] args) {
		//Calendar cal = new Calender();
		//Calendar cal = new GregorianCalendar();   //자식클래스를 이용하는 방법
		Calendar cal = Calendar.getInstance();         //static을 이용하는 방법 
		System.out.println("오늘은 " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + 
		                                        cal.get(Calendar.DATE) + "일입니다.");
	}
}

//abstract class Human{
//	private String tel;
//	private String address;
//	private static String str = "Hello, World";
//	public Human(String tel, String address) {
//		this.tel = tel;
//		this.address = address;
//	}
//	
//	public static String getInstance() {
//		return str;
//	}
//	@Override
//	public String toString() {
//		return String.format("Human [tel=%s, address=%s]", tel, address);
//	}
//	
//}