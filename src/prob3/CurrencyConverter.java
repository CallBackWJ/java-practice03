package prob3;

public class CurrencyConverter {

	
	private static double rate;
	public static void setRate(double d) {
		// TODO Auto-generated method stub
		rate=d;
	}

	public static double toDollar(int i) {
		// TODO Auto-generated method stub
		return i/rate;
	}

	public static double toKRW(int i) {
		// TODO Auto-generated method stub
		return i*rate;
	}
}
