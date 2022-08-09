class Product implements Comparable<Product>, Cloneable{
	private String name;
	private int price;
	private String maker;
	
	public void setPrice(int price) {
		this.price = price;
	}
	Object copy(){
		Object obj = null;
		try {
			obj = this.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("이 객체는 복제를 지원하지 않습니다.");
		}
		return obj;
	}
	@Override
	public int compareTo(Product obj) {
		//return obj.name.compareTo(this.name);
		return this.maker.compareTo(obj.maker);
	}
	//앞에 객체 - 뒤의 객체 : 오름차순
	//뒤의 객체 - 앞의 객체 : 내림차순
	
	
	public Product(String name, int price, String maker) {
		this.name = name;
		this.price = price;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%s, maker=%s]", name, price, maker);
	}

	
}
