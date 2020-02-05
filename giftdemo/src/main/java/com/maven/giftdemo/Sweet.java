package com.maven.giftdemo;

public class Sweet {
	String name;
	int cal;
	public Sweet(String sn,int sc)
	{
		name=sn;
		cal=sc;
		
	}
	public int weight(int amt)
	{
		return amt*cal;
	}

}
class Sweet1 extends Sweet{
	int amt;
	public Sweet1(String sn,int sc,int amount) {
		super(sn,sc);
		amt=amount;

	}
	
	public int weight()
	{
		int p=super.weight(amt);
		return p;
	}
}
class Sweet2 extends Sweet{
	int amt;
	public Sweet2(String sn,int sc,int amount) {
		super(sn,sc);
		amt=amount;

	}
	
	public int weight()
	{
		int p=super.weight(amt);
		return p;
	}
}

