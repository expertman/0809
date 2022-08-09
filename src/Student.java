
public class Student implements Comparable<Student>{
	private String name;
	private int total;
	
	public Student(String name, int total) {
		this.name = name;
		this.total = total;
	}

	@Override
	public int compareTo(Student o) {
		//return this.total - o.total;
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, total=%s]", name, total);
	}
}
