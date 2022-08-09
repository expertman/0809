/*
 * 3. interface는 instance화할 수 없다. 
 */
public interface InterfaceDemo {
	public static void main(String[] args) {
		//Datable d = new Datable();
		Datable d = new Dated();
		d.set(Datable.TUE);
		System.out.println(d.get());
	}
}
