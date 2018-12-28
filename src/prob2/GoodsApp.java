package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {

		Goods[] arrayGoods=new Goods[COUNT_GOODS];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<COUNT_GOODS;++i)
		{
			String line=sc.nextLine();
			String[] tokens=line.split(" ");
			
			String name=tokens[0];
			int price=Integer.parseInt(tokens[1]);
			int count=Integer.parseInt(tokens[2]);
			arrayGoods[i]=new Goods(name, price, count);
		}
		for(int i=0;i<COUNT_GOODS;++i)
		{
			System.out.println(arrayGoods[i].toString());
		}
		
	}
}
