/*
 * 6. interface의  주소는 해당 인터페이스의 재정의된 메소드만 접근가능하다.
 * 7. interface배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다. 
 */
public class InterfaceDemo1 extends Object implements Father, Mother {
	@Override
	public void grandFather() {   System.out.println("Called by grandFather().");    }
	@Override
	public void grandMother() {  System.out.println("Called by grandMother()");    }
	@Override
	public void mother() {   System.out.println("Called by mother()");  }
	@Override
	public void father() {    System.out.println("Called by father()");   }

	public static void main(String[] args) {
		//GrandFather gFather = new InterfaceDemo1();     gFather.grandFather();
		//Father father = new InterfaceDemo1();     father.grandFather();  father.grandMother();   father.father();
		Mother [] array = new Mother[3];
		array[0] = new InterfaceDemo1();   
		array[0].mother();
		
		System.out.println("Father's MAX = " + Father.MAX);
		System.out.println("Mother's MAX = " + Mother.MAX);
	}
}
