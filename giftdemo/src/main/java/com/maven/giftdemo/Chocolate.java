package com.maven.giftdemo;

public class Chocolate {
  
	String name;
	
	public Chocolate(String cn) {
		name=cn;
	}
	public int weight(int h,int w,int l) {
		return h*w*l;
	}
}

 class Waffy extends Chocolate{
	int h,w,l;
	public Waffy(String cn,int munchh,int munchw,int munchl) {
		super(cn);
		h=munchh;
		w=munchw;
		l=munchl;
		
		
		
	}
	public int weight() {
		int x=super.weight(h,w,l);
		return x;
	}


}
 class Creamy extends Chocolate{
	int h,w,l;
	public Creamy(String cn,int munchh,int munchw,int munchl) {
		super(cn);
		h=munchh;
		w=munchw;
		l=munchl;
		
		
		
	}
	public int weight() {
		int x=super.weight(h,w,l);
		return x;
	}


}
