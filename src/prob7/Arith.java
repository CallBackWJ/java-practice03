package prob7;

public abstract class Arith {

	protected int a;
	protected int b;
	
	public Arith setValue(int a, int b)
	{
		this.a=a;
		this.b=b;
		return this;
	}
	public abstract int calculate();
}
