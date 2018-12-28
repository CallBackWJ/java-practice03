package prob2;

public class Goods {

	private String name;
	private int value;
	private int count;
	
	public Goods(String name, int value, int count) {
		super();
		this.name = name;
		this.value = value;
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return name + "( 가격:" + value + ")이 " + count + "개 입고 되었습니다.";
	}
	
	
}
